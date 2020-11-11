package com.example.configserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*
 * Created by Aleksei Vekovshinin on 05.11.2020
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http
            .authorizeRequests()
//                .antMatchers("/actuator/**").permitAll()
                .anyRequest().permitAll()
//                .anyRequest().authenticated()
            .and()
                .httpBasic();
    }

}
