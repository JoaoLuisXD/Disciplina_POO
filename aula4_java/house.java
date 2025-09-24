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

    // Acessadores de variáveis privadas

    public int getNumDoors() {
        return numDoors;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public String getAdress() {
        return adress;
    }

    // Modificadores de variáveis privadas

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
