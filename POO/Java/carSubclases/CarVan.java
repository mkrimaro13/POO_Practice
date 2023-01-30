package Java.carSubclases;

import Java.Account;
import Java.Car;

import java.util.ArrayList;
import java.util.Map;

public class CarVan extends Car {
    Map<String,Map<String,String>> typeCarAccepted; // Se utiliza el Map porque se necesita: <Marca,<Modelo, Año>>
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    public CarVan(String license, Account driver, Map<String,Map<String,String>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }

    @Override
    public void setPassenger(Integer passenger) { // Se está sobreescribiendo el método y se le está dando otro comportamiento.
        //super.setPassenger(passenger);
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("La cantidad de pasajeros indicada no es válida");
        }
    }
}
