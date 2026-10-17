package game;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MarioGame {
    private int score;
    private MarioState state;

    private List<String> eventos = new ArrayList<>();
    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private String estadoAtual;

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



    public void nextStage(MarioState next){
        MarioState anterior = state;
        this.state = next;

        String antes = anterior.getClass().getSimpleName();
        String prox = next.getClass().getSimpleName();
        registerEvent(antes ,prox);
    }

    private void registerEvent(String anterior, String atual){
        String time = LocalDateTime.now().format(FORMAT);
        eventos.add(String.format("[%s] %s | %s => %s | score = %d",
                time, estadoAtual,anterior,atual,score));
    }

    public boolean isDone(){
//        return state.getClass().getSimpleName().equals("Dead");

      return state instanceof Dead;
    }

    @Override
    public String toString() {
        return "MarioGame{" +
                "eventos=" + eventos +
                '}';
    }

    //delegate methods
    public void takeFlower() {
        estadoAtual = "Took Flower";
        state.takeFlower();
    }


    public void incrementScore(){
        estadoAtual = "recive points";
        this.score += 1000;
        MarioState Atual = state;
        String mesmoEstado = Atual.getClass().getSimpleName();
        registerEvent(mesmoEstado,mesmoEstado);
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

    public int getScore() {
        return score;
    }
}
