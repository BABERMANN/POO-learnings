package game;

public class Big implements MarioState {

    private MarioState mario;

     Big(MarioState mario) {
        this.mario = mario;
    }

    @Override
    public void takeFlower() {
        return null;
    }

    @Override
    public void takeFeather() {

    }

    @Override
    public void takeMushroom() {

    }

    @Override
    public void takeDamage() {

    }
}
