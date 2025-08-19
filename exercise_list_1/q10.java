package exercise_list_1;

import java.util.Locale;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of your sales: ");
        float value = sc.nextFloat();

        if (value > 50000) 
        {
            System.out.println("The comission amount will be 12% !!!");
            value = value + value * 0.12f;
            System.out.println("New value: " + value);
        }
        else if (value >= 30000f && value <= 50000) 
        {
            System.out.println("The comission amount will be 9.5% !!!");
            value = value + value * 0.095f;
            System.out.println("New value: " + value);
        }
        else
        {
            System.out.println("The comission amount will be 7% !!!");
            value = value + value * 0.7f;
            System.out.println("New value: " + value);
        }
        
        sc.close();
    }   
}
