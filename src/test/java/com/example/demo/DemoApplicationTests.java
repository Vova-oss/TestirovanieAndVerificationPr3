package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.LinkedList;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void testCreateDeck() {
        assert Main.cards.isEmpty();
        Main.createDeck();
        assert Main.cards.size() == 36;
    }

    @Test
    void testCreateArms() {
        Main.createDeck();
        Main.firstPlayer = new LinkedList<>();
        Main.secondPlayer = new LinkedList<>();
        Main.createArms();
        assert Main.firstPlayer.size() == 6;
        assert Main.secondPlayer.size() == 6;
    }

    @Test
    void testCleanAllDecks() {
        Main.createDeck();
        Main.createArms();
        Main.cleanAllDecks();
        assert Main.cards.isEmpty();
        assert Main.firstPlayer.isEmpty();
        assert Main.secondPlayer.isEmpty();
    }

    @Test
    void testCreateTableOfPower() {
        Main.tableOfPower = new HashMap<>();
        Main.createTableOfPower();
        assert Main.tableOfPower.size() ==9;
    }

    @Test
    void testCreateTrump() {
        Main.trump = null;
        Main.createTrump();
        assert Main.trump != null;
    }

}
