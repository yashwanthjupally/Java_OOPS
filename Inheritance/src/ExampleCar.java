class Vehicle{
    double price;
    double mileage;
    String color;
    void display(){
        System.out.println(price);
        System.out.println(mileage);
        System.out.println(color);
    }
}
class Car extends Vehicle{
    String fuel;
    boolean sunroof;
    String brand;
}

public class vehicle {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "BMW";
        car1.fuel = "Petrol";
        car1.sunroof = true;
        car1.color = "red";
        car1.display();
    }
}
