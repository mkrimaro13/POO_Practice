from car import Car

class CarVan(Car):
    typeCarAccepted = []
    seatsMaterial = []

    def __init__(self, license, driver, passenger, brand, model):
        super.__init__(license, driver, passenger)
        self.brand = brand
        self.model = model