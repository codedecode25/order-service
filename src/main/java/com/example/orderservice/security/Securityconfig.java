package com.example.orderservice.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@EnableWebSecurity

public class Securityconfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable() // Disable CSRF protection (if not needed)
                .authorizeRequests()
                .antMatchers("/**").permitAll() // Allow all requests
                .anyRequest().authenticated();
        //.cors();
    }
}
