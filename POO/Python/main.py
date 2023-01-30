from car import Car
from account import Account


if __name__ == "__main__":
    print('Hi')
    # car = Car()
    # car.license = "ABC123"
    # car.driver = "Marco Osorio"
    # car.passenger = 4
    # print(vars(car))  # Imprime en como un diccionario/JSON

    # car2 = Car();
    # car2.license = "DEF456"
    # car2.driver = "Manuela Lopera"
    # car2.passenger = 2   
    # print(vars(car2))  # Imprime en como un diccionario/JSON

    car = Car("ABC123", Account("Marco Osorio", "1234", "abc@mail.com", "1234pass"))
    car.setPassenger(4)
    print(vars(car))
    print(vars(car.driver))
