package aula4_java;

public class atividade3_poo {
    public static void main(String[] args) {

        house casa1 = createHouse(1, 2, "Center");
        house casa2 = createHouse(3, 4, "Interior");

        System.out.println(casa1.adress);
        System.out.println(casa2.adress);
    } 
    public static house createHouse(int numDoors, int numWindows, String adresss)
    {
        house house1 = new house();
        house1.numDoors = numDoors;
        house1.numWindows = numWindows;
        house1.adress = adresss;
        return house1;
    }
}
