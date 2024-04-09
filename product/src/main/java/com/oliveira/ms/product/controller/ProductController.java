package com.oliveira.ms.product.controller;

import java.security.Principal;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("products")
@Log4j2
public class ProductController {

    @GetMapping()
    public String getProduct(Principal principal) {
        var username = principal.getName();
        if (principal instanceof JwtAuthenticationToken token) {
            log.info("claims: " + token.getTokenAttributes());
        }
        return "Hello, " + username;
    }

    @GetMapping("fullname")
    public String getFullName(@AuthenticationPrincipal OidcUser user) {
        var username = user.getFullName();

        return "Hello, " + username;
    }

}
