package com.myfitnessgoal.myfitnessgoal.security;
import java.util.Map;
import java.util.Set;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;

public class GoogleUserInfo {
    private Map<String, Object> attributes;
    private String role;
    private String jwtToken;

    public GoogleUserInfo(OidcUser user) {
        this.attributes = user.getAttributes();
        this.jwtToken = user.getIdToken().getTokenValue();
        Set<String> authorities = AuthorityUtils.authorityListToSet(user.getAuthorities());

        // Iterate through all authority params and fetch the role. Ex: "ROLE_USER"
        authorities.forEach(authority -> {
            String roleSplitKey = "ROLE_";
            if(authority.contains(roleSplitKey)) {
                this.role = authority.split(roleSplitKey)[1];
            }
        });
    }

    public String getId() {
        return (String) attributes.get("sub");
    }

    public String getFirstName() {
        return (String) attributes.get("given_name");
    }

    public String getLastName() {
        return (String) attributes.get("family_name");
    }

    public String getEmail() {
        return (String) attributes.get("email");
    }

    public String getRole() {
        return role;
    }

    public String getJWTToken() {
        return jwtToken;
    }

}