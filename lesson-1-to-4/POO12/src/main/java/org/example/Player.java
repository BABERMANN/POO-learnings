package org.example;

public class Player {
    private String name;
    private int number;
    private String position;
    private boolean isFielded;
    private Team team;

    public Player(String name, int number, String position, boolean isFielded) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.isFielded = isFielded;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public boolean isFielded() {
        return isFielded;
    }

    public void setFielded(boolean fielded) {
        isFielded = fielded;
    }

    public String getStateAsString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name + " - ");
        sb.append(number + " - ");
        sb.append(position + " - ");
        if(isFielded) sb.append("Jogador esta em campo");
        else sb.append("Jogador fora de campo");

        return sb.toString();
    }
}
