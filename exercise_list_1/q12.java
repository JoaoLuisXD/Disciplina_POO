package exercise_list_1;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        int screw = 0,nut = 0,washer = 0;
        System.out.println("SHOP\n-----------------------\n");
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
                    System.exit(0);
                    break;
                default:
                    System.out.println("Try another number");
                    break;
            }
        }   
        while (choose != 0); 


        sc.close();
    }
}
