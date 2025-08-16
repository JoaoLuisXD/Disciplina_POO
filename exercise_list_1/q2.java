package exercise_list_1;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius to convert to Fahrenheit: ");
        float Celsius = sc.nextFloat();
        float Fahrenheit = (9 * Celsius + 160) / 5;

        System.out.print("Temperature in Fahrenheit: " + Fahrenheit);
        sc.close();
    }
}
