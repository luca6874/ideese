package Controllers;

import View.AuthViews;

public class AuthController {

    private AuthViews vista;

    public AuthController(){
        vista = new AuthViews();
    }
    
    public void login(){
        vista.login();
    }
}
