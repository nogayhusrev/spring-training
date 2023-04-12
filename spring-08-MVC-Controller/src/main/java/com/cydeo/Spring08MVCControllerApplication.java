package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = {AopAutoConfiguration.class})
public class Spring08MVCControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring08MVCControllerApplication.class, args);
    }

}
