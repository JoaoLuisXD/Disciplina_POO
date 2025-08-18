package exercise_list_1;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n <= 10) System.out.println("F1");
        else if(n > 10 && n <= 100) System.out.println("F2");
        else if(n > 100) System.out.println("F3");


        sc.close();
    }
}
