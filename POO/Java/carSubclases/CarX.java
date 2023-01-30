package Java.carSubclases;

import Java.Account;
import Java.Car;

public class CarX extends Car {
    String brand;
    String model;

    public CarX(String license, Account driver,String brand, String model){
        // Se utiliza el método SUPER para referirse al objeto padre
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
    @Override
    public void printDataCar() {
        // TODO Auto-generated method stub
        super.printDataCar();
        System.out.println("Marca: " + brand + "Modelo: " + model);
    }
}
