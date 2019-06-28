package com.example.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

@SpringBootApplication
@RestController
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);





		Security.addProvider(new com.sun.crypto.provider.SunJCE());

		try {

			KeyGenerator kg = KeyGenerator.getInstance("DES");

			Key key = kg.generateKey();

			System.out.println("Key format: " + key.getFormat());

			System.out.println("Key algorthm: " + key.getAlgorithm());

			System.out.println("Key generateKey: " + kg.generateKey().toString());


		}

		catch (NoSuchAlgorithmException e) {

			e.printStackTrace();

		}
	}
}
