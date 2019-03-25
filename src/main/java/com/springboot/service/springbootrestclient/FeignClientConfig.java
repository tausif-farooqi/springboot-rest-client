package com.springboot.service.springbootrestclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.auth.BasicAuthRequestInterceptor;

/**
 * Feign client configuration to provide Basic Auth credentials.
 * 
 * @author Tausif Farooqi
 *
 */
@Configuration
public class FeignClientConfig {
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
         return new BasicAuthRequestInterceptor("apiuser", "tausif");
    }
}
