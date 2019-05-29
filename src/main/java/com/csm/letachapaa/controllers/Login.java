package com.csm.letachapaa.controllers;

import com.csm.letachapaa.models.Users;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/login")
public class Login {

    @PostMapping(value = "/validate")
    public ResponseEntity Login(@RequestBody Users users) {

        System.out.println("Response from body " + users.toString());
        return ResponseEntity.ok(HttpStatus.OK);

    }
}

