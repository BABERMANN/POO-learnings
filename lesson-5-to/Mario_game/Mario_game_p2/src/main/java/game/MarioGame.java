package game;

import java.util.Random;

public class MarioGame {
    private final MarioState state;

    public MarioGame(MarioState state) {
        this.state = new Small(this);

    }

    public void takeMystryBox(){
        Random random = new Random();
        switch (random.nextInt(3)){
            case 0: takeFlower(); break;
            case 1:takeFeather(); break;
            case 2:takeMushroom(); break;
        }
    }

    public void nextState(MarioState next){
    }

    public void incrementScore(){

    }

    public Boolean isDone(){
        return false;
    }


    public void takeFlower() {
        state.takeFlower();
    }

    public void takeFeather() {
        state.takeFeather();
    }

    public void takeMushroom() {
        state.takeMushroom();
    }

    public void takeDamage() {
        state.takeDamage();
    }
}
