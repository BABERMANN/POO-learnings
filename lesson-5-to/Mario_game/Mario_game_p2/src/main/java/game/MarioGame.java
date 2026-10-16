package game;

import java.util.Random;

public class MarioGame {
    private int Score;
    private MarioState state;

    public MarioGame() {
        this.state = new Small(this);
        this.Score = 0;
    }

    public void TakeMystryBox(){
        Random random = new Random();
        switch(random.nextInt(3)){
            case 0 : takeFeather(); break;
            case 1 : takeFlower(); break;
            case 2 : takeMushromm(); break;
        }
    }

    public void nextStage(MarioState next){
        this.state = next;
    }


    //delegate methods
    public void takeFlower() {
        state.takeFlower();
    }

    public void takeFeather() {
        state.takeFeather();
    }

    public void takeMushromm() {
        state.takeMushromm();
    }

    public void takeDamage() {
        state.takeDamage();
    }
}
