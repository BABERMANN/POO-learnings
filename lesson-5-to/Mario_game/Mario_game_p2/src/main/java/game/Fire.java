package game;

public class Fire implements MarioState{
    private MarioGame mario;

    public Fire(MarioGame mario) {
        this.mario = mario;
    }

    @Override
    public void takeFlower() {
        mario.incrementScore();
    }

    @Override
    public void takeFeather() {
        mario.nextStage(new Cape(mario));
    }

    @Override
    public void takeMushromm() {
        mario.incrementScore();
    }

    @Override
    public void takeDamage() {
        mario.nextStage(new Big(mario));
    }
}
