package org.example.quest7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BingoSystem bingoSystem = BingoSystem.getInstance();
        List<BingoCard> bingoCards = new ArrayList<>();
        int numberOfCards = 5;
        int numberOfSlots = 6;
        int maxNumber = 50;
        for (int i = 1; i <= numberOfCards; i++) {
            bingoCards.add(new BingoCard(bingoSystem, i, numberOfSlots, maxNumber));
        }
        System.out.println(bingoCards);
    }
}
