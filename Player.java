package com.telran.org.Homework.HomeworkFohr;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private  final List<Card>hand ;

    public Player(String name) {
        this.name = name;

        this.hand = new ArrayList<>();
    }
    public void addCardtoHand(Card card){
        hand.add(card);
    }
    public  List<Card>getHand(){
        return hand;
    }

    @Override
    public String toString() {
        return name;
    }
}
