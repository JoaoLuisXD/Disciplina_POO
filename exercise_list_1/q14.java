package exercise_list_1;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float iceCreamMango = 0.50f;
        float iceCreamStrawberry = 0.60f;
        float iceCreamLimon = 0.75f;
        float totalToPay = 0;
        int mangoCount = 0;
        int strawberryCount = 0;
        int limonCount = 0;

        System.out.println("--------------------------");
        System.out.println("ICE CREAM WORLD");
        System.out.println("--------------------------");

        int choose = 0;
        do 
        {
            System.out.println("--------------------------");;
            System.out.println("1 - Mango - R$ " + iceCreamMango);
            System.out.println("2 - Strawberry - R$ " + iceCreamStrawberry);
            System.out.println("3 - Limon - R$ " + iceCreamLimon );
            System.out.println("--------------------------");
            System.out.print("Wich ice you want: ");
            choose = sc.nextInt();
            System.out.println("--------------------------");
            switch (choose) {
                case 1:
                    mangoCount++;
                    break;
                case 2:
                    strawberryCount++;
                    break;
                case 3:
                    limonCount++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("INVALID NUMBER, TRY ANOTHER ONE");
                    break;
            }
            
        } 
            
        while (choose != 0);
        
        float totalLimon = iceCreamLimon * limonCount;
        float totalStrawberry = iceCreamStrawberry * strawberryCount;
        float totalMango = iceCreamMango * mangoCount;
        totalToPay = totalLimon + totalStrawberry + totalMango;
        System.out.printf("Full price: %.2f\n", totalToPay);
        System.out.println("Mango: " + mangoCount);
        System.out.println("Strawberry: " + strawberryCount);
        System.out.println("Limon: " + limonCount);
        System.out.println("(--------------------------");
        

        sc.close();
    }
}
