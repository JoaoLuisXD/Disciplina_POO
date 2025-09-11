package aula4_java;

import java.util.ArrayList;

public class atividade1_poo {
    public static void main(String[] args) {
    ArrayList  lista = new ArrayList();
    lista.add(1);
    lista.add("1");
    lista.add(1.0f);
    System.out.println("tamanho: " + lista.size());
    for (int i = 0; i < lista.size(); i++) 
    {
        System.out.println(lista.get(i));
    }
    
    lista.remove(1);

    }
}
