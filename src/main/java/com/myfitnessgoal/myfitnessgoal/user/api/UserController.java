package com.myfitnessgoal.myfitnessgoal.user.api;

import java.util.Collections;
import java.util.Map;

import com.myfitnessgoal.myfitnessgoal.user.model.User;

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
    public User user(@AuthenticationPrincipal User principal) {
        // System.out.println("OAuth2User" + principal);
        return principal;
        // return Collections.singletonMap("name", principal.getAttribute("name"));
    }

}