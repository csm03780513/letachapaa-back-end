package com.csm.letachapaa.modules;

import com.csm.letachapaa.GlobalData.GlobalVariables;
import com.csm.letachapaa.models.LoginData;
import com.csm.letachapaa.models.Users;
import com.csm.letachapaa.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginModule {
    @Autowired
    UsersRepository usersRepository;

    LoginData loginData;

    private boolean isValid;

    public LoginModule(LoginData loginData) {
        this.loginData = loginData;
    }

    public boolean authenticateCredentials(Users users) {
        String password = usersRepository.findByUsername(users.getUsername()).getPassword();

        if (users.getPassword().equals(password)) {
            isValid = true;
            loginData.setLoginMessage(GlobalVariables.SUCCESSFUL_MESSAGE);
            loginData.setResponseCode(200);
            loginData.setSuccessful(true);
        }

        return isValid;
    }
}
