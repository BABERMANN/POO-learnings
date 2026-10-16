package game;

public class MarioGame {
    private int Score;
    private MarioState state;

    public MarioGame() {
        this.state = new Small(this);
        this.Score = 0;
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
