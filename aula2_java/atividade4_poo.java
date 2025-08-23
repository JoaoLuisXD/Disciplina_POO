package aula2_java;

import java.util.Scanner;

public class atividade4_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("--------------");
        System.out.println("CALCULATOR");
        System.out.println("--------------");

        System.out.println("Enter two numbers below");
        System.out.print("-> ");
        int n1 = sc.nextInt();
        System.out.print("-> ");
        int n2 = sc.nextInt();
        int result = 0;
        int choose;
        do 
        {
            System.out.println("--------------");
            System.out.println("Wich operation you want to do ?");
            System.out.println("1 - ADD");
            System.out.println("2 - SUBTRACT");
            System.out.println("0 - LEAVE");
            System.out.print("-> ");
            choose = sc.nextInt();
            System.out.println("--------------");    
           switch (choose) {
            case 1:
                result = n1 + n2;
                System.out.println("=> " + result);
                break;
            case 2:
                result = n1 + n2;
                System.out.println("=> " + result);
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid number");
                break;
           }    

        }  while (choose != 0);

        System.out.println("Thank You");

        sc.close();
    }
}
