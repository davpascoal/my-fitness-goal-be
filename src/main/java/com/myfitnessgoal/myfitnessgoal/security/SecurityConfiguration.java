package com.myfitnessgoal.myfitnessgoal.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
// @EnableWebSecurity - Turns off default security
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomOidcUserService customOidcUserService;
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        // Enable h2 with security settings 
        .antMatchers("/h2/**").permitAll().and()
        .csrf().ignoringAntMatchers("/h2/**").and()
        .headers().frameOptions().disable()
        // --
        .and()
        .authorizeRequests()
        .anyRequest().authenticated()
        .and()
        .oauth2Login()
        .userInfoEndpoint().oidcUserService(customOidcUserService);
    }
}
