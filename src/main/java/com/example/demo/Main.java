package com.example.demo;

import java.util.*;

public class Main {

    static Suit trump;
    static String motion = "первый";
    static List<Card> cards = new LinkedList<>();
    static List<Card> firstPlayer = new LinkedList<>();
    static List<Card> secondPlayer = new LinkedList<>();
    static Map<String, Integer> tableOfPower = new HashMap<>();



    public static void main(String[] args) {

    }

    public static void cleanAllDecks(){

    }

    public static void createTableOfPower(){

    }

    public static void createTrump(){

    }

    public static void createDeck(){
        Suit[] suits = Suit.values();
        Value[] values = Value.values();
        for (Suit suit : suits) {
            for (Value value : values) {
                Card card = new Card(value, suit);
                cards.add(card);
            }
        }
    }

    public static void createArms(){
        while (firstPlayer.size()<6){
            Card card = cards.get((int) (Math.random()*cards.size()));
            firstPlayer.add(card);
            cards.remove(card);
            card = cards.get((int) (Math.random()*cards.size()));
            secondPlayer.add(card);
            cards.remove(card);
        }
    }



    public static void play(){

    }

    public static void whoIsFirst(){

    }

    public static void playerAttack(List<Card> current, List<Card> next, String nextName){

    }

    public static boolean playerDefend(Card enemyCard, List<Card> current, String nextName){
       return false;
    }

    public static void takeSomeCard(List<Card> current, List<Card> next){

    }


    public static boolean checkFight(Card enemyCard, Card card) {
        return false;
    }


}

