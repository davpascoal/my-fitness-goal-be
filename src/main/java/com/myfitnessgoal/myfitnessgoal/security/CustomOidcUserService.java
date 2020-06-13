package com.myfitnessgoal.myfitnessgoal.security;

import java.util.Optional;

import com.myfitnessgoal.myfitnessgoal.role.entity.Role;
import com.myfitnessgoal.myfitnessgoal.role.repository.RoleRepository;
import com.myfitnessgoal.myfitnessgoal.user.entity.User;
import com.myfitnessgoal.myfitnessgoal.user.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserRequest;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;

@Service
public class CustomOidcUserService extends OidcUserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public OidcUser loadUser(OidcUserRequest userRequest) {
        OidcUser oidcUser = super.loadUser(userRequest);

        try {
            return processOidcUser(userRequest, oidcUser);
        } catch (Exception e) {
            throw new InternalAuthenticationServiceException(e.getMessage(), e.getCause());
        }
    }

    private OidcUser processOidcUser(OidcUserRequest userRequest, OidcUser oidcUser) {
        GoogleUserInfo googleUserInfo = new GoogleUserInfo(oidcUser);

        Optional<User> userOptional = userRepository.findByEmail(googleUserInfo.getEmail());

        // If the user does not exist we want to persist a new user
        if (!userOptional.isPresent()) {
            User user = new User();
            user.setEmail(googleUserInfo.getEmail());
            user.setFirstName(googleUserInfo.getFirstName());
            user.setLastName(googleUserInfo.getLastName());

            // Optional<Role> roleOptional = roleRepository.findByType(googleUserInfo.getRole());
            // if (roleOptional.isPresent()) {
            //     user.setRole(roleOptional.get());
            // }

            userRepository.save(user);
        }

        return oidcUser;
    }
    
}