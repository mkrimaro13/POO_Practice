package Java.carSubclases;

import Java.Account;
import Java.Car;

import java.util.ArrayList;
import java.util.Map;

public class CarBlack extends Car {
    Map<String,Map<String,String>> typeCarAccepted; // Se utiliza el Map porque se necesita: <Marca,<Modelo, Año>>
    ArrayList<String> seatsMaterial;

    public CarBlack(String license, Account driver, Map<String,Map<String,String>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }
}
