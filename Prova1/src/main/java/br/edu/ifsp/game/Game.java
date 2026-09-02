package br.edu.ifsp.game;

public class Game {
    private Player player1;
    private Player player2;
    private Hand[] hands;
    private int pointsp1 = 0;
    private int pointsp2 = 0;
    private int maoNum = 0;


    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.hands = new Hand[30];
        hands[maoNum] = new Hand(player1,player2);
    }

    public void play(){
        for (int i = 0; i < hands.length; i++) {
            for (int j = 0; j < 3; j++) {
                hands[maoNum].playRound();
                if(hands[maoNum].isDone()){
                    if(hands[maoNum].getWinner().equals(player1.getName())) {
                        pointsp1++;
                        System.out.println(player1.getName() + " Pontuou!!");
                    }
                    if(hands[i].getWinner().equals(player2.getName())){
                        pointsp2++;
                        System.out.println(player2.getName() + " Pontuou!!");
                    }
                }

            }
            maoNum++;
            hands[maoNum] = new Hand(player1,player2);
        }

    }

    public boolean isDone(){
       return maoNum == 30;
    }

    public String getWinner(){
        if(isDone()){
            if(pointsp1 > pointsp2) return player1.getName();
            else return player1.getName();
        }
        return null;
    }


}
