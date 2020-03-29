package com.test.springboot.demo.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;

/**
 * @Author lidai
 * @Date 2020/1/7 16:20
 */
@Configuration
public class ElasticsearchConfig {

    @Value("${elasticsearch.host}")
    private String host;

    @Value("${elasticsearch.port}")
    private int port;

    @Value("${elasticsearch.scheme}")
    private String scheme;

    @Value("${elasticsearch.timeout}")
    private int timeout;

    @Bean(name = "highLevelClient")
    public RestHighLevelClient restHighLevelClient() {
        //可以传httpHost数组
        RestClientBuilder builder = RestClient.builder(new HttpHost(host, port, scheme));
        builder.setRequestConfigCallback(requestConfigBuilder -> {
            //设置超时
            return requestConfigBuilder.setSocketTimeout(timeout);
        });
        return new RestHighLevelClient(builder);
    }

    /**
     * es7 已废弃 TransportClient,但是代码记录中用到，故留存。7.x版本可以直接舍弃
     *
     * @return
     */
    @Bean
    public TransportClient transportClient() {
        try {
            Settings settings = Settings.builder().put("cluster.name", "elasticsearch")
                    .put("client.transport.sniff", true)
                    .build();
            TransportClient transportClient = new PreBuiltTransportClient(settings);
            TransportAddress address = new TransportAddress(InetAddress.getByName(host), port);
            transportClient.addTransportAddress(address);
            return transportClient;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}