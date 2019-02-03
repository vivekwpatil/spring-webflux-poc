package com.java.engineering.springwebfluxpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebfluxPocApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringWebfluxPocApplication.class, args);
        HelloWorldWebClient hwc = new HelloWorldWebClient();

        hwc.getResult();
    }

}

