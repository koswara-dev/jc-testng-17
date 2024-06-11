package com.juaracoding;

public class Login {

    public boolean isLogin(String username, String password) {

        if(username.equals("admin") && password.equals("password")){
            return true;
        } else {
            return false;
        }
    }

}
