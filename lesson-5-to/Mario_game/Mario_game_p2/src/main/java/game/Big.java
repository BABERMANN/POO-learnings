package game;

public class Big implements MarioState{
    private MarioGame mario;

    public Big(MarioGame mario) {
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
    public void takeMushromm() {
        mario.incrementScore();
    }

    @Override
    public void takeDamage() {
        mario.nextStage(new Small(mario));
    }
}
