package aula1_java;
import java.util.Scanner;

public class atividade3_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value for the radius of the Circle: ");
        float radius = sc.nextFloat();
        
        float area = 3.14159f * (radius * radius);
        //double area = 3.14159f * Math.pow(radius, 2); || another way to calculate the area.

        float perimeter = 2 * 3.14159f * radius;
        

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        sc.close();
    }
}
