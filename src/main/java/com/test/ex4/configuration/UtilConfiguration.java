package com.test.ex4.configuration;

import com.test.ex4.StringUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilConfiguration {

    @Bean("stringUtils")
    public StringUtil stringUtil(){
        return new StringUtil();
    }

}
