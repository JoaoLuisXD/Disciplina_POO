package exercise_list_4;

public class Boleto extends Payment{
    private String code;

    Boleto(double value, String code){
        super(value);
        this.code = code;
    }

    public void printPayment(){
        System.out.println("Value: " + getValue());
        System.out.println("Code: " + code);
    }
}
