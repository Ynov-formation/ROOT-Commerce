package com.ynov.commerce.service.auth;

import com.ynov.commerce.entities.auth.JwtAuthenticationResponse;
import com.ynov.commerce.entities.auth.LoginRequest;
import com.ynov.commerce.entities.auth.SignUpRequest;

public interface AuthenticationService {

    JwtAuthenticationResponse signup(SignUpRequest request);
    JwtAuthenticationResponse signin(LoginRequest request);
}
