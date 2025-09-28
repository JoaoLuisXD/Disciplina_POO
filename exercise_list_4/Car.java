package exercise_list_4;

public class Car {
    private int numDoors;
    private int numSeats;
    private String carPlate;
    
    
    Car(int numDoors, int numSeats, String carPlate){
    this.numDoors = numDoors;
    this.numSeats = numSeats;
    this.carPlate = carPlate;
    }

    Car(){}

    Car(int numDoors, String carPlate){
        this.numDoors = numDoors;
        this.carPlate = carPlate;
    }

    public int getNumDoors(){
        return numDoors;
    }

    public int getNumSeats(){
        return numSeats;
    }
    
    public String getCarPlate(){
        return carPlate;
    }

    public void setNumDoors(int numDoors){
        this.numDoors = numDoors;
    }

    public void setNumSeats(int numSeats){
        this.numSeats = numSeats;
    }

    public void printCar(){
        System.out.println("number doors: " + numDoors);
        System.out.println("number seats: "+ numSeats);
        System.out.println("car plate: " + carPlate);
        System.out.println("---------------------");
    }
    
    public void addSeats(){
        numSeats++;
    }
}


