package exercise_list_4;

public class Pix extends Payment{
    private String key;

    Pix(double value, String key){
        super(value);
        this.key = key;
    }

    public void printPayment(){
        System.out.println("Value: " + getValue());
        System.out.println("Password: " + key);
    }
}
