package com.nogayhusrev.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Data
@Configuration
public class AppConfigData {

    @Value("${username}")
    private String userName;

    @Value("${password}")
    private String password;

    @Value("${url}")
    private String url;

}
