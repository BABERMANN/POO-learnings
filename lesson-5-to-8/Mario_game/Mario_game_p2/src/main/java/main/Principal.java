package main;
import game.MarioGame;
import player.Player;

public class Principal {
    static void main(String[] args) {
        System.out.println("ola");

        MarioGame game = new MarioGame();

        game.takeMushroom();
        game.incrementScore();
        game.takeFlower();
        game.takeFlower();
        game.TakeMystryBox();
        game.takeFeather();

        game.takeDamage();

        System.out.println(game.getScore());

        System.out.println(game.toString());


    }
}
