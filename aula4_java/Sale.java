package aula4_java;

public class Sale extends House{
    private float saleValue;
    
    public Sale(int numDoors, int numWindows, String adress, float saleValue){
        super(numDoors,numWindows,adress);
        this.saleValue = saleValue;
    }

    public void setSaleValue(float saleValue) {
        this.saleValue = saleValue;
    }

    public float getSaleValue(){
        return saleValue;
    }
}
