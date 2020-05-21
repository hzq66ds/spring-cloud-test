package com.test.springboot.demo;


import io.searchbox.client.JestResult;
import io.searchbox.client.http.JestHttpClient;
import io.searchbox.indices.CreateIndex;
import org.apache.http.HttpHost;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.action.DocWriteRequest;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.Request;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ElasticSearch的三大客户端比较
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Test test = new Test();
        test.transportClient();
//        test.restClient();

    }

    /**
     * 相当于额外启动了一个es的node节点，只是这个node是由我们编码控制的，可以设置成这个node是不存数据的节点（没有特殊原因你就应该这么设置），这个节点的配置和其他的节点没有什么区别
     */
    public void transportClient()throws IOException{
        // 设置集群名称
        Settings settings = Settings.builder().put("cluster.name", "docker-cluster").build();
        // 创建client
        TransportClient client = new PreBuiltTransportClient(settings).addTransportAddress(new TransportAddress(InetAddress.getByName("k001"), 30008));

        //TODO 搜索数据
//        GetResponse response = client.prepareGet("school", "student", "001").execute().actionGet();
//        System.out.println(response.getSource());


        client.prepareBulk("school","student");
        BulkRequest bulkRequest = new BulkRequest();

        //TODO 增加数据
//        IndexRequest indexRequest = new IndexRequest("school","student","003");
//        indexRequest.opType(DocWriteRequest.OpType.CREATE);
//        Map st = new HashMap<>();
//        st.put("calssnum","num001");
//        st.put("name","张抒扬");
//        st.put("age",12);
//        List<Map> teacher = new ArrayList();
//        Map te1 = new HashMap<>();
//        Map te2 = new HashMap<>();
//        te1.put("name","teacher001");
//        te1.put("subject","语文");
//        te1.put("name","teacher002");
//        te1.put("subject","数学");
//        teacher.add(te1);
//        teacher.add(te2);
//        st.put("teachaer",teacher);
//        indexRequest.source(st);
//        bulkRequest.add(indexRequest);
        //TODO 删除数据
        DeleteRequest deleteRequest = new DeleteRequest("school","student","003");
        bulkRequest.add(deleteRequest);

        client.bulk(bulkRequest);
        client.close();
    }

    public void jestClient()throws IOException{
        String index = "school";
        JestHttpClient jestClient = new JestHttpClient();
//        jestClient.
        // 设置集群名称
        JestResult jestResult = jestClient.execute(new CreateIndex.Builder(index).build());
        System.out.println("createIndex:{}" + jestResult.isSucceeded());
    }

    public void restClient()throws IOException{
        RestClient restClient = RestClient.builder(new HttpHost("k001", 30008, "http")).build();
        Request request = new Request("GET","/school");
        Response response = restClient.performRequest(request);
        System.out.println(EntityUtils.toString(response.getEntity()));
    }
}
