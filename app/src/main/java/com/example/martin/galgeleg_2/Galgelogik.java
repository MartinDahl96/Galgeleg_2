package com.example.martin.galgeleg_2;

import android.content.Intent;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Martin on 16/10/2017.
 */

public class Galgelogik {
    /**
     * Oprettelse af variabler.
     * wordSample indeholder de ord, der kan gættes på i spillet
     * chosenWord indeholder et tilfældigt ord fra wordSample
     * usedLetters indeholder de bogstaver, som brugeren har gættet på i løbet af spillet
     * visibleWord er den del af chosenWord, som brugeren kan se
     * letter er det bogstav som brugeren gætter på
     * nrOfWrongLetters er antallet af forkerte bogstaver brugeren gætter på
     * correctLetter afgør, hvorvidt det gættede bogstav er i ordet eller ej
     * win afgør om spilleren har vundet
     * lose afgør om spillere har tabt
     */
    private ArrayList<String> wordSample = new ArrayList<String>();
    private String chosenWord;
    private ArrayList<String> usedLetters = new ArrayList<String>();
    private String visibleWord;
    private String letter;
    private int nrOfWrongLetters;
    private boolean correctLetter;
    private boolean win;
    private boolean lose;


    /**
     * Bliver brugt til at returnere wordSample
     * @return wordSample
     */
    public ArrayList<String> getWordSample() {
        return wordSample;
    }

    /**
     * Bliver brugt til at returnere det valgte ord
     * @return chosenWord
     */
    public String getChosenWord() {
        return chosenWord;
    }

    /**
     * Bliver brugt til at returnere de bogstaver, der er blevet gættet på
     * @return usedLetters
     */
    public ArrayList<String> getUsedLetters() {
        return usedLetters;
    }

    /**
     * Bliver brugt til at returnere det synlige ord
     * @return visibleWord
     */
    public String getVisibleWord() {
        return visibleWord;
    }

    /**
     * Bliver brugt til at returnere antallet af forkerte gæt
     * @return nrOfWrongLetters
     */
    public int getNrOfWrongLetters() {
        return nrOfWrongLetters;
    }

    /**
     * Bliver brugt til at returnere, hvorvidt det gættede bogstav var rigtigt
     * @return correctLetter
     */
    public boolean getCorrectLetter() {
        return correctLetter;
    }

    /**
     * Bliver brugt til at returnere, hvorvidt spilleren har vundet
     * @return win
     */
    public boolean getWinStatus() {
        return win;
    }

    /**
     * Bliver brugt til at oprette en samling af ord der kan gættes på
     * og kalder derefter reset()
     */
    public Galgelogik() {
        wordSample.add("frugt");
        wordSample.add("kaktus");
        wordSample.add("glas");
        wordSample.add("pizza");
        wordSample.add("cykel");
        wordSample.add("telefon");
        wordSample.add("bus");
        wordSample.add("bil");
        wordSample.add("billede");
        wordSample.add("dyne");
        wordSample.add("computer");
        wordSample.add("hvid");
        wordSample.add("vasketøj");
        wordSample.add("københavn");
        wordSample.add("ballerup");
        wordSample.add("skovlunde");
        wordSample.add("stol");
        wordSample.add("tæppe");
        wordSample.add("app");
        wordSample.add("smælk");
        wordSample.add("chokoladefontæneskræk");
        wordSample.add("differentialkvotient");
        wordSample.add("taylorpolynomie");
        wordSample.add("altankasser");
        wordSample.add("humlebi");
        reset();
    }


    /**
     * Bliver brugt til at nulstille spillet, hvilket gøres i starten af spillet
     */
    public void reset() {
        usedLetters.clear();
        nrOfWrongLetters = 0;
        correctLetter = false;
        win = false;
        lose = false;
        chosenWord = wordSample.get(new Random().nextInt(wordSample.size()));
        updateVisibleWord();
    }

    /**
     * Bruges til at opdatere det synlige ord, altså at fjerne " * " fra ordet, hvis et rigtigt bogstav gættes
     */
    public void updateVisibleWord() {
        visibleWord = "";
        win = true;
        for (int i = 0; i < chosenWord.length(); i++) {
            letter = chosenWord.substring(i, i + 1);
            if (usedLetters.contains(letter)) {
                visibleWord = visibleWord + letter;
            } else {
                visibleWord = visibleWord + "*";
                win = false;
            }
        }
    }

    /**
     * Bruges til at gætte på et bogstav og ser om dette er i ordet
     * @param letter som er brugerens gæt
     */
    public void letterGuess(String letter) {
        if (letter.length() != 1) return;
        System.out.println("Du gætter på bogstavet: " + letter);
        if (usedLetters.contains(letter)) return;
        if (win || lose) return;

        usedLetters.add(letter);

        if (chosenWord.contains(letter)) {
            correctLetter = true;
            System.out.println("Dette bogstav var korrekt: " + letter);
        } else {
            correctLetter = false;
            System.out.println("Dette bogstav var ikke korrekt: " + letter);
            nrOfWrongLetters = nrOfWrongLetters + 1;

            if (nrOfWrongLetters > 6) {
                lose = true;
            }
        }
        updateVisibleWord();
    }

    /**
     * Bruges til at lave en status over spillet, som det er nu.
     * Bliver brugt i test-sammenhæng
     */
    public void status() {
        System.out.println("----------");
        System.out.println("- chosenWord (skjult) = " + chosenWord);
        System.out.println("- visibleWord = " + visibleWord);
        System.out.println("- nrOfWrongLetters = " + nrOfWrongLetters);
        System.out.println("- usedLetters = " + usedLetters);
        if (lose) System.out.println("- De har tabt spillet");
        if (win) System.out.println("- De har vundet");
        System.out.println("----------");
    }

}
