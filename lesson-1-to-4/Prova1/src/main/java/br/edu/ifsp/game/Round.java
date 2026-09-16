package br.edu.ifsp.game;

import br.edu.ifsp.deck.Card;

public class Round {
    private String winner;

    public Round(String player1, Card card1, String player2, Card card2, Card vira){
        if(card1.compareValueTo(card2,vira) > 0 ) winner = player1;
        if(card1.compareValueTo(card2,vira) < 0 ) winner = player2;
        if(card1.compareValueTo(card2,vira) == 0 ) winner = null;
        this.winner = winner;
    }

    public String getWinner(){
        return winner;
    }

}
