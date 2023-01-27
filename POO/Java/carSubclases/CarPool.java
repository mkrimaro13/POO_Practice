package Java.carSubclases;

import Java.Account;
import Java.Car;

public class CarPool extends Car {
    String brand;
    String model;

    public CarPool(String license, Account driver, Integer passenger,String brand, String model){
        // Se utiliza el método SUPER para referirse al objeto padre
        super(license, driver, passenger);
        this.brand = brand;
        this.model = model;
    }
}

