package exercise_list_1;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        int screw = 0,nut = 0,washer = 0;
        float priceScrew = 5, priceNut = 10, priceWasher = 15;
        System.out.println("\n-----------------------\nSHOP");
        System.out.println("-----------------------\n1 - SCREWS\n2 - NUTS\n3 - WASHERS\n0 - EXIT\n-----------------------");
        int choose;
        do
        {
            
            System.out.print("Enter a number to buy somenthing you want: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    screw++;
                    break;
                case 2:
                    nut++;
                    break;
                case 3:
                    washer++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Try another number");
                    break;
            }
        }   
        while (choose != 0); 

        // Subtotals
        float subScrew = screw * priceScrew;
        float subNut = nut * priceNut;
        float subWasher = washer * priceWasher;

        // Discounts
        float discScrew = subScrew * 0.2f;
        float discNut = subNut * 0.1f;
        float discWasher = subWasher * 0.3f;

        // Totals
        float totalDiscount = discScrew + discNut + discWasher;
        float totalGross = subNut + subScrew + subWasher;
        float totalToPay = totalGross - totalDiscount;


        System.out.println("Name: " + name);
        System.out.println("Screw: " + screw);
        System.out.println("Nut: " + nut);
        System.out.println("Washer" + washer);
        System.out.printf("Full price: %.2f\n", totalGross);
        System.out.printf("Total discount: %.2f\n", totalDiscount);
        System.out.printf("Total to pay: %.2f", totalToPay);


        sc.close();
    }
}
