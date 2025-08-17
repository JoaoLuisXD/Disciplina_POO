package exercise_list_1;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Squared number: " + Math.pow(n, 2));
        System.out.println("Cubed number: " + Math.pow(n, 3));

        sc.close();
    }
}
