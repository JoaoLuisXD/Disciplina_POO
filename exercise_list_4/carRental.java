package exercise_list_4;

public class carRental {
    public static void main(String[] args) {
        Car car1 = new Car(4,5,"JO8-P3I");
        Car car2 = new Car(2,"WSA-77E");
        Car car3 = new Car();

        car1.printCar();
        car1.addSeats();
        car2.printCar();
        car3.printCar();
        System.out.println("after add seats on car 1");
        System.out.println("-------------------");
        car1.printCar();
        System.out.println(car1.getNumSeats());
    }    
}
