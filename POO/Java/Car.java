package Java;


public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver, Integer passenger){ 
        // Recibe los parámetros obligatorios, los parámetros están siendo llamados de manera LOCAL al método, luego con el "this." se esta asignando a la variable GLOBAL
        this.license = license;
        this.driver = driver;
        this.passenger = passenger;
    }

    void printDataCar(){
        System.out.println("Licencia: " + license+ "\nConductor: "+ driver.name + "\nPasajeros: " + passenger);
    }

}
