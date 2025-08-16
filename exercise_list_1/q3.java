package exercise_list_1;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = sc.nextFloat();
        System.out.print("Enter the height: ");
        float height = sc.nextFloat();

        float volume = 3.14159f * (radius * radius) * height;
        System.out.print("Volume of a can of oil: " + volume);

        sc.close();
    }
}
