package exercise_list_4;

public class RentCar extends Car{
    float rentValue;

    public RentCar(int numDoors, int numSeats, String carPlate, float rentValue){
        super(numDoors, numSeats, carPlate);
        this.rentValue = rentValue;
    }

    public float getRentValue(){
        return rentValue;
    }

    public void setRentValue(float rentValue){
        this.rentValue = rentValue;
    }

    public void printCar(){
        System.out.println("Rent Value: " + rentValue);
    }

    public float sellerComission(){
        return rentValue * 0.5f;
    }
}
