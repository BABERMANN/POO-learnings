package br.edu.ifsp.game;

import br.edu.ifsp.deck.Card;
import br.edu.ifsp.deck.Deck;

public class Hand {
    private Card vira;
    private Player player1;
    private Player player2;
    private Round[] rounds;
    private int contRound = 0;

    public Hand(Player player1, Player player2) {
        Deck deck = new Deck();
        deck.shuffle();
        vira = deck.takeOne();

        Card[] cardsplayer1 = deck.take(3);
        Card[] cardsplayer2 = deck.take(3);

        player1.setCards(cardsplayer1);
        player2.setCards(cardsplayer2);

        this.player1 = player1;
        this.player2 = player2;
        this.rounds = new Round[3];
    }

    public void playRound() {
        Round thisRound = new Round(player1.getName(), player1.chooseCard(), player2.getName(), player2.chooseCard(), vira);
        String thisRoundWinner = thisRound.getWinner();
        rounds[contRound] = thisRound;
        contRound++;
        System.out.println(thisRoundWinner);
    }

    public boolean isDone() {
        return contRound == 3;
    }

    public String getWinner() {
        int player1Pontos = 0;
        int player2Pontos = 0;
        for (int i = 0; i < 3; i++) {
            if (rounds[i].getWinner().equals(player1.getName())) player1Pontos++;
            if (rounds[i].getWinner().equals(player2.getName())) player2Pontos++;
            if (player1Pontos > 1) return player1.getName();
            if (player2Pontos > 1) return player2.getName();
        }
        return null;
    }
}