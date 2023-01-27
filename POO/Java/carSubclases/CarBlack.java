package Java.carSubclases;

import Java.Account;
import Java.Car;

import java.util.ArrayList;
import java.util.Map;

public class CarBlack extends Car {
    Map<String,Map<String,Integer>> typeCarAccepted; // Se utiliza el Map ya que va primero <Marca,<Modelo, Año>>
    ArrayList<String> seatsMaterial;

    public CarBlack(String license, Account driver, Integer passenger, Map<String,Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver, passenger);

    }
}
