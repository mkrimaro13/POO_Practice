package Java;

import Java.AccountSubclases.Driver;
import Java.carSubclases.CarX;

class Main{
    public static void main(String[] args) {
        /*
        Car car = new Car("ABC123", new Account("Marco Osorio", "1234", "abc@mail.com", "1234pass"), 4);
        car.printDataCar();


        Car car2 = new Car("DEF456", new Account("Manuela Lopera", "5678", "def@mail.com", "5678word"), 2); 
        car2.printDataCar();
        */
        CarX car = new CarX("ABC123", new Driver("Marco", "1234", "abc@123", "1234"), "Renault", "2023");
        car.setPassenger(4);
        car.printDataCar();
    }
}