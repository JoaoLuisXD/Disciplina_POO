package exercise_list_1;

import java.util.Locale;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];   // nomes dos corretores
        float[] sales = new float[3];     // vendas
        float[] commissions = new float[3]; // comissão calculada

        float totalSales = 0;

        // Entrada de dados
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the name of broker " + (i + 1) + ": ");
            names[i] = sc.next();
            System.out.print("Enter the value of sales: ");
            sales[i] = sc.nextFloat();

            // Cálculo da comissão
            if (sales[i] > 50000) 
            {
                commissions[i] = sales[i] * 0.12f;
            } 
            else if (sales[i] >= 30000) 
            {
                commissions[i] = sales[i] * 0.095f;
            } 
            else 
            {
                commissions[i] = sales[i] * 0.07f;
            }

            totalSales += sales[i];
        }

        // Relatório
        System.out.println("\n--- SALES REPORT ---");
        for (int i = 0; i < 3; i++) 
        {
            System.out.printf("Broker: %s | Sale: %.2f | Commission: %.2f%n",
            names[i], sales[i], commissions[i]);
        }

        System.out.printf("\nTOTAL SALES OF COMPANY: %.2f%n", totalSales);

        sc.close();
    }   
}
