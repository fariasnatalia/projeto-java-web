package com.buffet.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {   
    
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authCongig -> {
            authCongig.requestMatchers(HttpMethod.GET, "/**").permitAll();
            authCongig.requestMatchers(HttpMethod.POST, "/comentarios/salvar").permitAll();
            authCongig.anyRequest().authenticated();            
        })
        .formLogin(login -> {
            login.loginPage("/login");
        });

        return http.build();
    }
}
