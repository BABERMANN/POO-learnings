package game;

public class Small implements MarioState{
    private MarioGame mario;

    public Small(MarioGame mario) {
        this.mario = mario;
    }

    @Override
    public void takeFlower() {
        mario.nextStage(new Fire(mario));
    }

    @Override
    public void takeFeather() {
        mario.nextStage(new Cape(mario));
    }

    @Override
    public void takeMushroom() {
        mario.nextStage(new Big(mario));
    }

    @Override
    public void takeDamage() {
        mario.nextStage(new Dead(mario));
    }
}
