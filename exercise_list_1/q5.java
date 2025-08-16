package exercise_list_1;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a value for length: ");
        float length = sc.nextFloat();
        System.out.print("Enter a value for height: ");
        float height = sc.nextFloat();
        System.out.print("Enter a value for width: ");
        float width = sc.nextFloat();

        float volume = length * height * width;
        System.out.println("Volume of a rectangular box: " + volume);

        sc.close();
    }
}
