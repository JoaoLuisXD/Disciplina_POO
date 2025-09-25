package aula4_java;

public class Rent extends House{

    private float rentValue;
    
    public Rent(int numDoors, int numWindows, String adress, float rentValue){
        super(numDoors,numWindows,adress);
        this.rentValue = rentValue;
    }

    public float getRentValue(){
        return rentValue;
    }

    public void setRentValue(float rentValue){
        this.rentValue = rentValue;
    }
}
