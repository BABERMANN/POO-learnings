package game;

public class Cape implements MarioState{
    private MarioGame mario;

    public Cape(MarioGame mario) {
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
        mario.incrementScore();
    }

    @Override
    public void takeDamage() {
        mario.nextStage(new Big(mario));
    }
}
