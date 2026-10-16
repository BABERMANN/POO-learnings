package game;

public class MarioGame {
    private final MarioState state;

    public MarioGame(MarioState state) {
        this.state = state;
    }

    public void takeMystryBox(){}

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
