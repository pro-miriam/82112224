package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/api/v1/user")
@Controller
public class UserController {

    @GetMapping
    public ResponseEntity<?> user() {
        return ResponseEntity.ok("82112224");
    }
}
