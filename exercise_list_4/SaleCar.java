package exercise_list_4;

public class SaleCar extends Car{
    float sellingPrice;

    public SaleCar(int numDoors, int numSeats, String carPlate, float sellingPrice){
        super(numDoors, numSeats, carPlate);
        this.sellingPrice = sellingPrice;
    }

    public float getSellingPrice(){
        return sellingPrice;
    }

    public void setSellingPrice(float sellingPrice){
        this.sellingPrice = sellingPrice;
    }

    public void printSale(){
        System.out.println("Selling price: " + sellingPrice);
    }

    public float sellerComission(){
        return sellingPrice * 0.8f;
    }
}
