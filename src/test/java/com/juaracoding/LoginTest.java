package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    Login login;

    @BeforeClass
    public void setUp(){
        login = new Login();
    }

    @Test
    public void testIsLogin(){
        boolean actual = login.isLogin("admin", "password");
        Assert.assertTrue(actual);
    }

}
