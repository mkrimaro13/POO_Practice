package Java.AccountSubclases;

import Java.Account;

public class Driver extends Account{

    public Driver(String name, String document, String email, String password) {
        super(name, document, email, password);
    }
    protected void printDriverInfo(){
        System.out.println("User name: " + name + "\nUser document: " + document + "\nUser email: " + email + "\nUser password: " + password);
    }
    
}
