package exercise_list_1;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your partial assessment grade 1: ");
        float pa_1 = sc.nextFloat();
        System.out.print("Enter your partial assessment grade 2: ");
        float pa_2 = sc.nextFloat();
        System.out.print("Enter your partial assessment grade 3: ");
        float pa_3 = sc.nextFloat();

        float gr_av = ((pa_1 * 2) + (pa_2 * 3) + (pa_3 * 5)) / 10;

        System.out.println("Grade average: " + gr_av);

        sc.close();
    }
}
