package br.edu.ifsp.game;

import br.edu.ifsp.deck.Card;

public class Player {
    private String name;
    private int score;
    private Card[] cards;

    public Player(String name) {
        this.name = name;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Card[] getCards() {
        return cards;
    }

    public Card chooseCard(){
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] != null){
                Card play = cards[i];
                cards[i] = null;
                return play;
            }
        }
        return null;
    }
}
