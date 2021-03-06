package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {


    // Попытка отбить Даму Пик Семью Червями
    @Test
    void tryToDefendWithIncorrectCard(){

        Main.trump = Suit.P;
        Main.createTableOfPower();
        InputStream inputStream = System.in;
        List<Card> list = new LinkedList<>();
        list.add(new Card(Value.ACE, Suit.P));
        list.add(new Card(Value.SEVEN, Suit.CH));

        ByteArrayInputStream in = new ByteArrayInputStream("1\n2\n0".getBytes());
        System.setIn(in);
        Main.playerDefend(new Card(Value.QUEEN, Suit.P), list, "второй");
        assert list.size() == 3;

        System.setIn(inputStream);

    }

    // Попытка использовать 5ую карту, однако в руке всего 2ц
    @Test
    void tryToSelectIncorrectCard(){

        Main.trump = Suit.P;
        Main.createTableOfPower();
        InputStream inputStream = System.in;
        List<Card> list = new LinkedList<>();
        list.add(new Card(Value.ACE, Suit.P));
        list.add(new Card(Value.SEVEN, Suit.CH));

        ByteArrayInputStream in = new ByteArrayInputStream("1\n5\n0".getBytes());
        System.setIn(in);
        Main.playerDefend(new Card(Value.QUEEN, Suit.P), list, "второй");
        assert list.size() == 3;

        System.setIn(inputStream);

    }

    // Попытка выбрать действие, которое не предусматривается программой
    @Test
    void tryToSelectIncorrectChoose(){
        InputStream inputStream = System.in;


        ByteArrayInputStream in = new ByteArrayInputStream("3\n2".getBytes());
        System.setIn(in);
        Main.main(new String[0]);

        System.setIn(inputStream);
    }


//    @Test
//    void testCreateDeck() {
//        assert Main.cards.isEmpty();
//        Main.createDeck();
//        assert Main.cards.size() == 36;
//    }
//
//    @Test
//    void testCreateArms() {
//        Main.createDeck();
//        Main.firstPlayer = new LinkedList<>();
//        Main.secondPlayer = new LinkedList<>();
//        Main.createArms();
//        assert Main.firstPlayer.size() == 6;
//        assert Main.secondPlayer.size() == 6;
//    }
//
//    @Test
//    void testCleanAllDecks() {
//        Main.createDeck();
//        Main.createArms();
//        Main.cleanAllDecks();
//        assert Main.cards.isEmpty();
//        assert Main.firstPlayer.isEmpty();
//        assert Main.secondPlayer.isEmpty();
//    }
//
//    @Test
//    void testCreateTableOfPower() {
//        Main.tableOfPower = new HashMap<>();
//        Main.createTableOfPower();
//        assert Main.tableOfPower.size() ==9;
//    }
//
//    @Test
//    void testCreateTrump() {
//        Main.trump = null;
//        Main.createTrump();
//        assert Main.trump != null;
//    }
//
//    @Test
//    void testCheckFight() {
//        Main.trump = Suit.B;
//        Main.createTableOfPower();
//        Card enemy = new Card(Value.ACE, Suit.B);
//        Card my = new Card(Value.JACK, Suit.B);
//        assert !Main.checkFight(enemy, my);
//
//        enemy = new Card(Value.SEVEN, Suit.B);
//        my = new Card(Value.JACK, Suit.B);
//        assert Main.checkFight(enemy, my);
//
//        enemy = new Card(Value.ACE, Suit.CH);
//        my = new Card(Value.JACK, Suit.B);
//        assert Main.checkFight(enemy, my);
//
//        enemy = new Card(Value.EIGHT, Suit.CH);
//        my = new Card(Value.NINE, Suit.CH);
//        assert Main.checkFight(enemy, my);
//
//        enemy = new Card(Value.KING, Suit.P);
//        my = new Card(Value.QUEEN, Suit.P);
//        assert !Main.checkFight(enemy, my);
//
//        enemy = new Card(Value.SEVEN, Suit.CH);
//        my = new Card(Value.JACK, Suit.P);
//        assert !Main.checkFight(enemy, my);
//    }
//
//    @Test
//    void testPlayerDefend() {
//        Main.trump = Suit.P;
//        Main.createTableOfPower();
//        InputStream inputStream = System.in;
//        List<Card> list = new LinkedList<>();
//        list.add(new Card(Value.ACE, Suit.P));
//        list.add(new Card(Value.SEVEN, Suit.CH));
//
//        ByteArrayInputStream in = new ByteArrayInputStream("1\n0".getBytes());
//        System.setIn(in);
//        Main.playerDefend(new Card(Value.QUEEN, Suit.P), list, "второй");
//        assert list.size() == 3;
//
//        in = new ByteArrayInputStream("1\n1".getBytes());
//        System.setIn(in);
//        assert Main.playerDefend(new Card(Value.QUEEN, Suit.P), list, "второй");
//
//        System.setIn(inputStream);
//
//    }
//
//    @Test
//    void testTakeSomeCard() {
//
//        Main.createDeck();
//
//        List<Card> current = new LinkedList<>();
//        current.add(new Card(Value.SEVEN, Suit.CH));
//        List<Card> next = new LinkedList<>();
//        next.add(new Card(Value.EIGHT, Suit.CH));
//
//        Main.takeSomeCard(current, next);
//        assert current.size() == 6;
//        assert next.size() == 6;
//
//    }
//
//    @Test
//    void testWhoIsFirst() {
//        Main.trump = Suit.P;
//        Main.createTableOfPower();
//        Main.firstPlayer.add(new Card(Value.EIGHT, Suit.CH));
//        Main.secondPlayer.add(new Card(Value.KING, Suit.P));
//
//        Main.whoIsFirst();
//        assert Main.motion.equals("второй");
//
//        Main.firstPlayer.clear();
//        Main.secondPlayer.clear();
//        Main.firstPlayer.add(new Card(Value.KING, Suit.P));
//        Main.secondPlayer.add(new Card(Value.EIGHT, Suit.P));
//
//        Main.whoIsFirst();
//        assert Main.motion.equals("второй");
//
//        Main.firstPlayer.clear();
//        Main.secondPlayer.clear();
//        Main.firstPlayer.add(new Card(Value.SIX, Suit.B));
//        Main.secondPlayer.add(new Card(Value.ACE, Suit.B));
//
//        Main.whoIsFirst();
//        assert Main.motion.equals("первый");
//
//    }
}
