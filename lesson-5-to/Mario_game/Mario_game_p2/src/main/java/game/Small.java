package game;

public class Small implements MarioState {
    private MarioGame mario;

    Small(MarioGame mario) {
        this.mario = mario;
    }

    @Override
    public void takeFlower() {
        mario.nextState(new Fire());
    }

    @Override
    public void takeFeather(){
        mario.nextState(new Cape());
    }

    @Override
    public void takeMushroom() {
        mario.nextState(new Big((MarioState) mario));
    }

    @Override
    public void takeDamage() {
        mario.nextState(new Dead());
    }
}
