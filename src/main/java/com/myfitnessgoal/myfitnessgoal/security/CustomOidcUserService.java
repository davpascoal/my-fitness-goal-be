package com.myfitnessgoal.myfitnessgoal.security;

import java.util.Optional;

import com.myfitnessgoal.myfitnessgoal.user.model.User;
import com.myfitnessgoal.myfitnessgoal.user.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserRequest;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;

@Service
public class CustomOidcUserService extends OidcUserService {

    @Autowired
    UserRepository UserRepository;

    @Override
    public OidcUser loadUser(OidcUserRequest userRequest) throws OAuth2AuthenticationException {
        OidcUser oidcUser = super.loadUser(userRequest);

        try {
            return processOidcUser(userRequest, oidcUser);
        } catch (Exception e) {
            throw new InternalAuthenticationServiceException(e.getMessage(), e.getCause());
        }
    }

    private OidcUser processOidcUser(OidcUserRequest userRequest, OidcUser oidcUser) {
        GoogleUserInfo googleUserInfo = new GoogleUserInfo(oidcUser.getAttributes());

        Optional<User> userOptional = UserRepository.findByEmail(googleUserInfo.getEmail());
        System.out.println("userOptional: " + userOptional);
        if (!userOptional.isPresent()) {
            User user = new User();
            user.setEmail(googleUserInfo.getEmail());
            user.setFirstName(googleUserInfo.getName());
            // Set more data if needed

            UserRepository.save(user);
        }

        return oidcUser;
    }
    
}