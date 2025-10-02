package exercise_list_4;

public class Card extends Payment{
    private String cardNum;

    Card(double value, String cardNum){
        super(value);
        this.cardNum = cardNum;
    }

    public void printPayment(){
        System.out.println("Value: " + getValue());
        System.out.println("Card Number: " + cardNum);
    }
}
