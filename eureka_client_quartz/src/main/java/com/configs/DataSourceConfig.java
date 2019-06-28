package com.configs;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import javax.sql.DataSource;

/**
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/6/21.
 */
@Configuration
@Order(value = 1)
public class DataSourceConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dateSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
