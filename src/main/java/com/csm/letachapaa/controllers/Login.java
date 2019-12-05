package com.csm.letachapaa.controllers;

import com.csm.letachapaa.models.Users;
import com.csm.letachapaa.modules.LoginModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/login")
public class Login {
    @Autowired
    LoginModule loginModule;


    @PostMapping(value = "/validate")
    public boolean Login(@RequestBody Users users) {

        return loginModule.authenticateCredentials(users);

    }
}

