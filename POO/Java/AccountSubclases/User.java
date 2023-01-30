package Java.AccountSubclases;

import Java.Account;

public class User extends Account{

    public User(String name, String document, String email, String password) {
        super(name, document, email, password);
    }
    protected void printUserInfo(){
        System.out.println("Driver name: " + name + "\nDriver document: " + document + "\nDriver email: " + email + "\nDriver password: " + password);
    }
    
}