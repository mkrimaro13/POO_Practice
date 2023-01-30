package Java;


public class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;

    public Car(String license, Account driver){ 
        // Recibe los parámetros obligatorios, los parámetros están siendo llamados de manera LOCAL al método, luego con el "this." se esta asignando a la variable GLOBAL
        this.license = license;
        this.driver = driver;
    }

    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passenger = passenger;
        }else{
            System.out.println("La cantidad de pasajeros indicada no es válida");
        }
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
    
    protected void printDataCar(){
        if(passenger != null){
            System.out.println("Licencia: " + license+ "\nConductor: "+ driver.name + "\nPasajeros: " + passenger);
        }
    }

}
