// Author: Harsh Gupta
// RollNo: 12MA20017
// 30th July 2014

import java.util.*;

public class CardGame {
    public static void main(String[] args) {
        CardGame game1 = new CardGame();
        game1.print_n_cards(3);
        System.exit(0);
    }

    public ArrayList<Integer> card_list;

    public CardGame() {
        card_list = new ArrayList<Integer>(52);
        for(Integer i=0; i < 52; i++) {
            card_list.add(i);
        }
        Collections.shuffle(card_list);
    }

    public void print_n_cards(Integer n) {
        for(Integer i=0; i < n; i++){
            System.out.println(card_name(card_list.get(i)));
        }
    }

    public static String card_name(Integer card_id) {
        String suit;
        String card;
        switch(card_id / 13) {
            case 0:
                suit = "Spade";
                break;
            case 1:
                suit = "Diamond";
                break;
            case 2:
                suit = "Hearts";
                break;
            case 3:
                suit = "Clubs";
                break;
            default:
                throw new IllegalArgumentException();
        }

        if (card_id % 13 < 10) {
            card = "" + ((card_id % 13) + 1);
        }
        else {
            switch(card_id % 13) {
                case 10:
                    card = "Jack";
                    break;
                case 11:
                    card = "Queen";
                    break;
                case 12:
                    card = "King";
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
        return suit + " " + card;
    }
}
