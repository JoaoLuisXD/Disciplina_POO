package exercise_list_4;

import java.util.ArrayList;

public class lista {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add(1);
        lista.add("1");
        lista.add(1.5);

        System.out.println(lista.size());

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        lista.remove(2);
        
        for (int i = 0; i < lista.size(); i++) 
        {
            System.out.println(lista.get(i));    
        }

    }
}
