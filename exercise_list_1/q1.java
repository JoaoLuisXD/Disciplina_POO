package exercise_list_1;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hours worked: ");
        float HW = sc.nextInt();
        System.out.print("Value per hour worked: ");
        float VPH = sc.nextFloat();
        System.out.print("Discount percentage: ");
        float DP = sc.nextFloat();

        float GS = HW * VPH;
        float TD = (DP/100) * GS;
        float NS = GS - TD;

        System.out.printf("HW: %.2f\nGS: %.2f\nTS: %.2f\nNS: %.2f",HW,GS,TD,NS);
        
        sc.close();
    }
}
