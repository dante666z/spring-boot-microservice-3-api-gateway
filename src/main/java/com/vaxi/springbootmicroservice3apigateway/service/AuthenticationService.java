package com.vaxi.springbootmicroservice3apigateway.service;

import com.vaxi.springbootmicroservice3apigateway.model.User;

public interface AuthenticationService {
    User sigInAndReturnJWT(User sigInRequest);
}
