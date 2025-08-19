package exercise_list_1;

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number account: ");
        int numberAccount = sc.nextInt();
        System.out.print("Enter your bank balance: ");
        float balance = sc.nextFloat();
        System.out.print("Which operation do you want to do\n----------------\n");
        System.out.println("1 - Deposit\n2 - Withdrawal\n----------------");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.print("How much do you want to depositate: ");
                float deposit = sc.nextFloat();
                balance = balance + deposit;
                break;
            case 2:
                System.out.print("How much would you like to withdraw: ");
                float withdrawal = sc.nextFloat();
                balance = balance - withdrawal;
                break;
            default:
                break;
        }
        
        System.out.println("Number account: " + numberAccount);
        if(balance < 0)
        {
            System.out.println("Overdrawn account");
        }
        System.out.println("New balance: " + balance);

        sc.close();
    }   
}
