package game;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MarioGame {
    private int score;
    private MarioState state;

    private List<String> eventos = new ArrayList<>();
    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static String estadoAtual;

    public MarioGame() {
        this.state = new Small(this);
        this.score = 0;
    }

    public void TakeMystryBox(){
        Random random = new Random();
        switch(random.nextInt(3)){
            case 0 : takeFeather(); break;
            case 1 : takeFlower(); break;
            case 2 : takeMushroom(); break;
        }
    }


    public void incrementScore(){
        this.score += 1000;
    }

    public void nextStage(MarioState next){
        MarioState anterior = state;
        this.state = next;
    }

    private void registerEvent(String anterior, String atual){
        String time = LocalDate.now().format(FORMAT);



    }

    //delegate methods
    public void takeFlower() {
        state.takeFlower();

    }

    public void takeFeather() {
        estadoAtual = "Took a Feather";
        state.takeFeather();
    }

    public void takeMushroom() {
        estadoAtual = "Took a Mushroom";
        state.takeMushroom();
    }

    public void takeDamage() {
        estadoAtual = "Took Damage";
        state.takeDamage();
    }
}
