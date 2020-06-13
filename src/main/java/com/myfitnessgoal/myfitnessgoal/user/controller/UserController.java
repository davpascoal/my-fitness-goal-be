package com.myfitnessgoal.myfitnessgoal.user.controller;

import java.util.Collections;
import java.util.Map;

import com.myfitnessgoal.myfitnessgoal.user.entity.User;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController
public class UserController {

    @GetMapping("/userOauth")
    public OAuth2User user(@AuthenticationPrincipal OAuth2User principal) {
        // System.out.println("OAuth2User" + principal);
        return principal;
        // return Collections.singletonMap("name", principal.getAttribute("name"));
    }

    @GetMapping("/user")
    public String user(@AuthenticationPrincipal Jwt principal) {
        // System.out.println("OAuth2User" + principal);
        System.out.println(principal);
        return principal.toString();
        // return Collections.singletonMap("name", principal.getAttribute("name"));
    }

}