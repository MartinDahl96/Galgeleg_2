package com.example.martin.galgeleg_2;
/**
 * Created by Martin on 16/10/2017.
 */

//importeret fra github.com/nordfalk/Galgeleg og tilpasset til mine metoder.

public class Galgelogik_Test {

    public static void main(String[] args) {

        Galgelogik spil = new Galgelogik();
        spil.reset();

        spil.status();

        spil.letterGuess("e");
        spil.status();

        spil.letterGuess("a");
        spil.status();
        System.out.println("" + spil.getNrOfWrongLetters());
        System.out.println("" + spil.getVisibleWord());
        if (spil.getWinStatus()) return;

        spil.letterGuess("i");
        spil.status();
        if (spil.getWinStatus()) return;

        spil.letterGuess("s");
        spil.status();
        if (spil.getWinStatus()) return;

        spil.letterGuess("r");
        spil.status();
        if (spil.getWinStatus()) return;

        spil.letterGuess("l");
        spil.status();
        if (spil.getWinStatus()) return;

        spil.letterGuess("b");
        spil.status();
        if (spil.getWinStatus()) return;

        spil.letterGuess("o");
        spil.status();
        if (spil.getWinStatus()) return;

        spil.letterGuess("t");
        spil.status();
        if (spil.getWinStatus()) return;

        spil.letterGuess("n");
        spil.status();
        if (spil.getWinStatus()) return;

        spil.letterGuess("m");
        spil.status();
        if (spil.getWinStatus()) return;

        spil.letterGuess("y");
        spil.status();
        if (spil.getWinStatus()) return;

        spil.letterGuess("p");
        spil.status();
        if (spil.getWinStatus()) return;

        spil.letterGuess("g");
        spil.status();
        if (spil.getWinStatus()) return;
    }
}


