package aula5_java;

import java.util.ArrayList;

public class mainGame {
    public static void main(String[] args) {
        Game g1 = new Physical("Rayman Legends", 20f, "L01");
        Game g2 = new Digital("Dragon Ball Z: Kakarot", 150, "1234");

        g1.printGame();
        g2.printGame();

        ArrayList<Game> games = new ArrayList<>();
        games.add(g1);
        games.add(g2);

        for(Game g:games){
            if(g instanceof Physical) g.printGame();
        }
    }
}
