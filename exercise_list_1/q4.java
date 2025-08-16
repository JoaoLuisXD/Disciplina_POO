package exercise_list_1;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B;
        int aux;
        System.out.print("Enter a value for A: ");
        A = sc.nextInt();
        System.out.print("Enter a value for B: ");
        B = sc.nextInt();

        aux = A;
        A = B;
        B = aux;

        System.out.println("Exchanged values");
        System.out.printf("A: %d\nB: %d",A,B);

        sc.close();
    }    
}
