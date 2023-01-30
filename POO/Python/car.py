from account import Account

class Car:
    id = int
    license = str
    driver =  Account("","","","")
    passenger = int

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver

    def setPassenger(self,passengerNum):
        if passengerNum >= 4:
            self.__passenger = int(passengerNum)
            print("Passengers asgindados : " + str(self.__passenger)) 

        else:
            print("El número de pasajeros es demasiado bajo para esta categoría")

    def getPassenger(self):
        if self.__passenger != int:
            print(self.__passenger)