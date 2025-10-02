package exercise_list_4;

public abstract class Payment{
    private double value;

    public abstract void printPayment();

    Payment(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }
    
    public void setValue(double value){
        this.value = value;
    }
}
