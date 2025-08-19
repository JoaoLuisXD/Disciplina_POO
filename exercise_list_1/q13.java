package exercise_list_1;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many cars you sell ?");
        int n_car = sc.nextInt();
        float wage = 3036;
        for(int i = 0; i < n_car; i++)
        {
            if (n_car > 1) {
                wage =  wage + 50;
            }
        }

        float comission = wage * 0.05f;
        float totalWage = wage + comission;

        System.out.printf("Total amount %.2f", totalWage);

        sc.close();
    }
}
