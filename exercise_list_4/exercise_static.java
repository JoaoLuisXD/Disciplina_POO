package exercise_list_4;

import java.util.Scanner;

public class exercise_static {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers to sum: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(sum(n1, n2));

        System.out.println("------------------");

        System.out.println(sub());

        System.out.println("------------------");

        System.out.println("enter a number to verify if is even or odd");
        int n3 = sc.nextInt();
        evenOrOdd(n3);

        sc.close();
    }

    public static int sum(int n1, int n2){
        return n1 + n2;
    }

    public static int sub(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter two numbers to sub: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        return n1 - n2;
    }

    public static void evenOrOdd(int n){
        if (n % 2 == 0) System.out.println("even");
        else System.out.println("odd");
    }
}
