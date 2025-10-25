package exercise_list_4;

import java.util.ArrayList;

public class mainPayment {
    public static void main(String[] args) {
        Payment p1 = new Pix(1000, "091124");
        Payment p2 = new Card(30, "1111-1111-1111-22");
        Payment p3 = new Boleto(372, "2022345610092");

        ArrayList<Payment> paymentList = new ArrayList<>();
        paymentList.add(p1);
        paymentList.add(p2);
        paymentList.add(p3);

        for(Payment p:paymentList){
            if (p instanceof Pix) p.printPayment();
        }
    }
}
