package ua.com.alevel.Task3;

public class GarageImpl {
    public static void main(String[] args) {
        Vehicle car1 = new Car();
        Car car2 = new Car();
        Bus bus1 = new Bus();
        Garage<Vehicle> garage = new Garage<>();
        garage.add(car1);
        garage.add(car2);
        garage.add(bus1);
        System.out.println(garage.getByType(Bus.class));
        System.out.println(garage.get(0));
        System.out.println(garage.get(1));
        System.out.println(garage.get(2));
    }
}
