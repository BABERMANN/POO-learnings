package game;

public class Dead implements MarioState{
    private MarioGame mario;

    public Dead(MarioGame mario) {
        this.mario = mario;
    }

    @Override
    public void takeFlower() {
        throw new GameRuleViolationException("Mario is dead");

    }

    @Override
    public void takeFeather() {
        throw new GameRuleViolationException("Mario is dead");
    }

    @Override
    public void takeMushroom() {
        throw new GameRuleViolationException("Mario is dead");
    }

    @Override
    public void takeDamage() {
        throw new GameRuleViolationException("Mario is dead");
    }
}
