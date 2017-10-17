package server.controller;

import server.models.User;
import server.dbmanager.dbmanager1;

import java.util.Scanner;


public class MainController {
    private AdminController adminController;
    private UserController userController;
    private User currentUser;
    private Scanner input;


    public MainController() {

    }

    public boolean authUser(String username, String password) {
        User user = new User();
        dbmanager1 dbmanager1 = new dbmanager1();

        user = dbmanager1.authorizeUser(username, password);

        if(user!=null) {
            user = currentUser;
            return true;

        }
        else {
            return false;
        }

    }




}
