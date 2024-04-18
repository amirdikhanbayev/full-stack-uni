package org.amirs.uniback.security.controller;

import lombok.RequiredArgsConstructor;
import org.amirs.uniback.security.authentication.AuthenticationRequest;
import org.amirs.uniback.security.authentication.AuthenticationResponse;
import org.amirs.uniback.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/auth")
public class AuthenticationController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody AuthenticationRequest cred){
        return ResponseEntity.ok(userService.createUser())
    }
}
