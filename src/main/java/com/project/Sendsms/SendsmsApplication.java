package com.project.Sendsms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SendsmsApplication {

	public static void main(String[] args) {
		sendSMS sd = new sendSMS();
		sd.sendNewSms();
		SpringApplication.run(SendsmsApplication.class, args);
	}

}
