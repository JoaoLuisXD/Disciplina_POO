package exercise_list_1;

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("JOAOZINHO SOCCER SCHOOL");
        System.out.println("------------------------------");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("-------------------------------");
        System.out.printf("|%s|",name);
        if (age >= 5 && age <= 10) 
        {
            System.out.println("|Children's category|");
        }
        else if (age >= 11 && age <= 15)
        {
            System.out.println("|Youth category|");
        }
        else if (age >= 16 && age <= 20) 
        {
            System.out.println("|Junior category|");
        }
        else if (age >= 21 && age <= 25) 
        {
            System.out.println("|Professional category|");
        }
        System.out.println("-------------------------------");
        sc.close();
    }
}
