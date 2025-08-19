package exercise_list_1;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        age = age * (12 * 30);

        System.out.printf("You lived %d days", age);

        sc.close();
    }
}
