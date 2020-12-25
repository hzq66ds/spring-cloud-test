package com;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/7/3.
 * @author HZQ-PC
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.dbEntity.member.basicmappers"})
public class EurekaClientTest {
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientTest.class, args);
	}
}
