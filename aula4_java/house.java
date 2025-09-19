package aula4_java;

public class House {
    private int numDoors;
    private int numWindows;
    private String adress;

    //Constructor

    House(int numDoors, int numWindows, String adress)
    {
        this.numDoors = numDoors;
        this.numWindows = numWindows;
        this.adress = adress;
    }

    House(){}

    House(String adress)
    {
        this.adress = adress;
    }

    public void printHouse()
    {
        System.out.println("Adress: " + adress);
        System.out.println("Number of doors: " + numDoors);
        System.out.println("Number of windows: " + numWindows);
        System.out.println("----------------------------");
    }

    public void addDoors()
    {
        numDoors++;
    }
}
