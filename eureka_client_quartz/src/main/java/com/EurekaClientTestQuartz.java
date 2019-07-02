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


@SpringBootApplication
@MapperScan(basePackages = {"com.dbEntity.member.basicmappers","my"})
public class EurekaClientTestQuartz {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientTestQuartz.class, args);
	}


	int[] sort(int[] arr1,int[] arr2){
		int[] result = new int[arr1.length+arr2.length];

		for (int i=0;i<arr1.length;i++) {
			result[i] = arr1[i];
		}
		for (int i=0;i<arr2.length;i++) {
			result[arr1.length+i] = arr2[i];
		}

		for (int i = 0; i < result.length; i++) {
			for (int j = i; j < result.length; j++){
				if (result[i]>result[j]){
					int tempno = result[i];
					result[i] = result[j];
					result[j] = tempno;
				}
			}

		}
		return result;
	}

	String reverseString(String string,String oldStr,String replaceStr){
		char[] list = string.toCharArray();

		for (int num=0; num <= (list.length+1)/2;num++) {
			if (num>list.length-num){
				break;
			}
			char temp = list[num];
			list[num] = list[list.length-num-1];
			list[list.length-num-1] = temp;
		}
		return String.valueOf(list).replace(oldStr,replaceStr);
	}


}
