package exercise_list_3;

public class primo {
    public static void main(String[] args) {
        int n = 3;

        int cont = 0;
        for (int i = 1; i < args.length; i++) 
        {
            if(n % i == 0)
            {
                cont++;
            }    
        }
        if(cont > 2) System.out.println("primo");
        else System.out.println("nao primo");
    }
}
