package Java.carSubclases;

import Java.Account;
import Java.Car;

public class CarPool extends Car {
    String brand;
    String model;

    public CarPool(String license, Account driver,String brand, String model){
        // Se utiliza el método SUPER para referirse al objeto padre
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}

