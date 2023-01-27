package Java.carSubclases;

import Java.Account;
import Java.Car;

import java.util.ArrayList;
import java.util.Map;

public class CarVan extends Car {
    Map<String,Map<String,String>> typeCarAccepted; // Se utiliza el Map porque se necesita: <Marca,<Modelo, Año>>
    ArrayList<String> seatsMaterial;

    public CarVan(String license, Account driver, Integer passenger, Map<String,Map<String,String>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver, passenger);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }
}
