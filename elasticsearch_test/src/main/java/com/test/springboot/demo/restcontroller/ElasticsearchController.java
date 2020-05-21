package com.test.springboot.demo.restcontroller;

import com.netflix.discovery.converters.wrappers.CodecWrappers;
import com.test.springboot.demo.dto.Person;
import org.apache.http.HttpHost;
import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.action.ActionListener;
import org.elasticsearch.action.DocWriteResponse;
import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.support.WriteRequest;
import org.elasticsearch.action.support.replication.ReplicationResponse;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.sort.SortOrder;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.InetAddress;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @Author lidai
 * @Date 2020/1/7 18:12
 */
@RestController
@RequestMapping("/elasticsearch")
public class ElasticsearchController {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    static DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    final String DEMO_INDEX = "task";
    final String DEMO_TYPE = "users";

    @Autowired
    @Qualifier(value = "highLevelClient")
    private RestHighLevelClient highLevelClient;

    @Autowired
    private TransportClient transportClient;

    /**
     * 新增
     *
     * @param person
     * @throws Exception
     */
    @PostMapping(value = "createPerson")
    public void createIndex(@RequestBody Person person) throws Exception {
//        Person person = new Person();
//        person.setId(1);
//        person.setName("name1");
//        List<String> aa = new ArrayList<>();
//        aa.add("person11");
//        aa.add("person22");
//        person.setIntrestings(aa);
//        XContentBuilder xContentBuilder = XContentFactory.jsonBuilder();
//        xContentBuilder = ElasticsearchUtils.objectToXContentBuilder(xContentBuilder, person);
//        //创建索引
//        IndexResponse indexResponse = transportClient.prepareIndex(DEMO_INDEX, DEMO_TYPE, person.getId().toString()).setSource(xContentBuilder)
//                //立即生效,无此需求可以不设置
//                .setRefreshPolicy(WriteRequest.RefreshPolicy.IMMEDIATE)
//                .execute().actionGet();


    }



    /**
     * 搜索示例
     *
     * @param params
     * @return
     */
    public List<Person> searchDemo(Map<String, Object> params) {
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
        boolQueryBuilder.must(QueryBuilders.termQuery("deleted", 0));
        String keyword = (String) params.get("keyword");
        Integer news = (Integer) params.get("news");
        Integer status = (Integer) params.get("status");
        Integer columnCategory = (Integer) params.get("columnCategory");
        String year = (String) params.get("year");
        Integer pageSize = (Integer) params.get("pageSize");
        Integer pageNum = (Integer) params.get("pageNum");
        String[] messageColumn = {"messageTitle", "messageSource", "content", "tags", "issuer"};
        //keyword字段类别搜索
        if (news != null && StringUtils.hasText(keyword)) {
            switch (news) {
                case 1:
                    boolQueryBuilder.must(QueryBuilders.multiMatchQuery(keyword, messageColumn));
                    break;
                case 2:
                    boolQueryBuilder.must(QueryBuilders.matchQuery("messageTitle", keyword));
                    break;
                case 3:
                    boolQueryBuilder.must(QueryBuilders.matchQuery("content", keyword));
                    break;
                case 4:
                    boolQueryBuilder.must(QueryBuilders.matchQuery("messageSource", keyword));
                    break;
                case 5:
                    boolQueryBuilder.must(QueryBuilders.matchQuery("tags", keyword));
                    break;
                case 6:
                    boolQueryBuilder.must(QueryBuilders.matchQuery("issuer", keyword));
                    break;
                default:
                    break;
            }
        }
        //发布状态搜索
        if (status != null) {
            switch (status) {
                case 1:
                    boolQueryBuilder.must(QueryBuilders.matchAllQuery());
                    break;
                case 2:
                    boolQueryBuilder.must(QueryBuilders.termQuery("status", 2));
                    break;
                case 3:
                    boolQueryBuilder.must(QueryBuilders.termQuery("status", 3));
                    break;
                default:
                    break;
            }
        }
        //栏目类别搜索
        if (columnCategory != null) {
            switch (columnCategory) {
                case 1:
                    boolQueryBuilder.must(QueryBuilders.matchAllQuery());
                    break;
                case 2:
                    boolQueryBuilder.must(QueryBuilders.termQuery("columnCategory", 2));
                    break;
                case 3:
                    boolQueryBuilder.must(QueryBuilders.termQuery("columnCategory", 3));
                    break;
                default:
                    break;
            }
        }
        //年份搜索,多年分传参形式为{"2016","2017","2018","2019","2020"}
        if (StringUtils.hasText(year)) {
            try {
                Integer y = Integer.valueOf(year);
                boolQueryBuilder.must(QueryBuilders.rangeQuery("updateDate").from(year + "-1-1").to(year + "-12-31"));
            } catch (NumberFormatException e) {
                String[] yearList = year.split(",");
                int max = Arrays.stream(yearList).mapToInt(Integer::valueOf).max().getAsInt();
                int min = Arrays.stream(yearList).mapToInt(Integer::valueOf).min().getAsInt();
                boolQueryBuilder.must(QueryBuilders.rangeQuery("updateDate").from(min + "-1-1").to(max + "-12-31"));
            }
        }
        SearchResponse searchResponse = transportClient.prepareSearch(DEMO_INDEX)
                .setTypes(DEMO_TYPE)
                .setQuery(boolQueryBuilder)
                .setFrom((pageNum - 1) * pageSize)
                .setSize(pageSize)
                .addSort("status", SortOrder.DESC)
                .addSort("updateDate", SortOrder.DESC)
                .addSort("id", SortOrder.DESC)
                .setExplain(true)
                .execute()
                .actionGet();
        SearchHits hits = searchResponse.getHits();
        int totalHits = (int) hits.getTotalHits().value;
        SearchHit[] searchHits = hits.getHits();
        List<Person> persons = new ArrayList<>(10);
        for (SearchHit searchHit : searchHits) {
            String sourceAsString = searchHit.getSourceAsString();
//            Person person = JSONObject.parseObject(sourceAsString, Person.class);
//            persons.add(person);
        }
        return persons;
    }

    /**
     * 查询分词结果，str为要分析的字符串，使用|将分词结果隔开
     *
     * @param str
     * @return
     */
//    public String queryAnalyzer(String str) {
//        if (StringUtils.hasText(str)) {
//            AnalyzeRequest analyzeRequest = new AnalyzeRequest(DEMO_INDEX).text(str)
//                    .analyzer("ik_max_word");
//            List<AnalyzeResponse.AnalyzeToken> tokens = this.transportClient.admin().indices().analyze(analyzeRequest)
//                    .actionGet().getTokens();
//            StringBuilder sb = new StringBuilder();
//            for (AnalyzeResponse.AnalyzeToken token : tokens) {
//                sb.append(token.getTerm());
//                sb.append("|");
//            }
//            str = sb.toString().substring(0, sb.toString().length() - 1);
//        }
//        return str;
//    }

    /**
     * 修改
     *
     * @param object
     * @throws IOException
     */
    public void updateIndex(Person person) throws IOException {
        XContentBuilder xContentBuilder = XContentFactory.jsonBuilder();
//        xContentBuilder = ElasticsearchUtils.objectToXContentBuilder(xContentBuilder, person);
        UpdateResponse updateResponse = transportClient.prepareUpdate(DEMO_INDEX, DEMO_TYPE, person.getId().toString())
                .setRefreshPolicy(WriteRequest.RefreshPolicy.IMMEDIATE)
                .setDoc(xContentBuilder).get();
    }

    /**
     * 批量修改
     *
     * @param ids
     * @throws IOException
     */
    public void batchUpdate(String[] ids) throws IOException {
        BulkRequestBuilder bulkRequestBuilder = transportClient.prepareBulk();
        for (String id : ids) {
            bulkRequestBuilder.add(transportClient.prepareUpdate(DEMO_INDEX, DEMO_TYPE, id)
                    .setDoc(XContentFactory.jsonBuilder().startObject().field("deleted", 1).endObject()));
        }
        BulkResponse response = bulkRequestBuilder.setRefreshPolicy(WriteRequest.RefreshPolicy.IMMEDIATE).get();
        if (response.hasFailures()) {
            throw new ElasticsearchException(response.buildFailureMessage());
        }
    }

    /**
     * 批量新增
     *
     * @param persons
     * @throws IOException
     */
    public void batchInsert(List<Person> persons) throws IOException {
        XContentBuilder xContentBuilder = XContentFactory.jsonBuilder();
        BulkRequestBuilder bulkRequestBuilder = transportClient.prepareBulk();
        //添加es
        for (Person person : persons) {
            //注意批量操作时数据为null会报异常
//            bulkRequestBuilder.add(transportClient.prepareIndex(DEMO_INDEX, DEMO_TYPE, person.getId().toString()).setSource(ElasticsearchUtils.objectToXContentBuilder(xContentBuilder, person)));
        }
        BulkResponse responses = bulkRequestBuilder.get();
        if (responses.hasFailures()) {
            throw new ElasticsearchException(responses.buildFailureMessage());
        }
    }

}