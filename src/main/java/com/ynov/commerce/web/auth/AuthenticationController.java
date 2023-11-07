package com.ynov.commerce.web.auth;

import com.ynov.commerce.entities.auth.JwtAuthenticationResponse;
import com.ynov.commerce.entities.auth.LoginRequest;
import com.ynov.commerce.entities.auth.SignUpRequest;
import com.ynov.commerce.service.auth.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("commerce/v1/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<JwtAuthenticationResponse> signup(@RequestBody SignUpRequest request) {
        return ResponseEntity.ok(authenticationService.signup(request));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authenticationService.signin(request));
    }
}
