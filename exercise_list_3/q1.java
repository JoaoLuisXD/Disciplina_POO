package exercise_list_3;

public class q1 {
    public static void main(String[] args) {
        int vet[] = {8, -2, 15, 0, 22, -5, 7, 1};
        int contpositivo = 0;
        int contnegativo = 0;
        int contzero = 0;
        int somapar = 0;
        int max = 0;

        for(int i = 0; i < vet.length; i++)
        {
            if(vet[i] > 0) contpositivo++;
            if(vet[i] < 0) contnegativo++;
            if(vet[i] == 0) contzero++;
            
            if(vet[i] % 2 == 0) somapar += vet[i];

            if (vet[i] > max) max = vet[i];
        }

        System.out.println("Qtd positivo: " + contpositivo);
        System.out.println("Qtd negativo: " + contnegativo);
        System.out.println("Qtd zeros: " + contzero);
        System.out.println("Somar par: " + somapar);
        System.out.println("Maior: " + max);
    }
}
