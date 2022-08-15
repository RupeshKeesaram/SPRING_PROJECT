package com.udemy.school.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception
    {
//      allows all requests to the web application
//        http.authorizeRequests().anyRequest().permitAll().and().formLogin().and().httpBasic();
        http.authorizeRequests().anyRequest().denyAll().and().formLogin().and().httpBasic();
        return http.build();
    }
}
