package com.kompraok.admin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.kompraok.common.entity","com.kompraok.admin.user"})
public class KompraokBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(KompraokBackEndApplication.class, args);
	}

}
