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

        input.nextLine();
        String username, password;
        System.out.println("Du har valgt: Login\n");
        System.out.println("Indtast dit brugernavn");
        username = input.nextLine();
        System.out.println("Indtast dit password");
        password = input.nextLine();

        boolean authUser = authUser(username, password);
        if(authUser = true) {
            System.out.println("hej");
        } else {
            System.out.println("ikke hej");
        }

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
