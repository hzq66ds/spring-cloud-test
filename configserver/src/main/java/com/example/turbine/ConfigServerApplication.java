package com.example.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);




		int[] aa = {1,6,8,9,5};
		ConfigServerApplication.b(1,5,aa);

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


	public static int[] a(int n1,int n2,int[] ii){
		List a= new ArrayList<>();
		int[] aa = new int[ii.length];
		Integer n1_temp = null;
		int j = 0, i = 0;
		for (; i < aa.length; ) {
			if (ii[j]!=n1){
				aa[i]=ii[j];
				if (aa[i]==n2){
					i++;
					aa[i]=n1;
				}
				i++;
			}
			j++;
		}
		return aa;
	}


	public static int[] b(int n1,int n2,int[] ii){
		int index = 0;
		for (int i = 0; i < ii.length; i++) {
			if (index==0 && ii[i]==n1){
				index += 1;
			}
			if (index == 1){
				ii[i] = ii[i] + ii[i+index];
				ii[i+index] = ii[i] - ii[i+index];
				ii[i] = ii[i] - ii[i+index];
			}
			if (index==0 && ii[i]==n2){
				i++;
				index = -1;
			}
			if (index == -1){
				ii[i] = ii[i] + n1;
				n1 = ii[i] - n1;
				ii[i] = ii[i] - n1;
			}
		}
		return ii;
	}

}
