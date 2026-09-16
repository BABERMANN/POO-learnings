package org.example;

public class Team {
    private String name;
    private String baseLocation;
    private String coachName;
    private Player[] time;
    private Player captain;
    private int qtdPlayer = 0;

    public Team(String name, String baseLocation, String coachName) {
        this.name = name;
        this.baseLocation = baseLocation;
        this.coachName = coachName;
        this.time = new Player[18];
    }

    public void addPlayer(Player player){
        if (player == null)return;
        if(qtdPlayer == time.length)return;
        for (int i = 0; i < time.length; i++) {
            if(time[i] == null){
                time[i] = player;
                qtdPlayer++;
                return;
            }
        }
    }

    public void removePlayer(Player player){
        if(player == null) return;
        if(qtdPlayer == 0) return;
        for (int i = 0; i < qtdPlayer; i++) {
            if(time[i] == player){
                for (int j = i; j < qtdPlayer - 1; j++) {
                    time[j] = time[j + 1];
                }
                time[qtdPlayer - 1] = null;
                qtdPlayer--;
                return;
            }
        }
    }

    public void substitute(Player starter,Player substitute){
        for (int i = 0; i < qtdPlayer; i++) {
            if(time[i] == starter){
                time[i] = substitute;
                substitute.setFielded(true);
                starter.setFielded(false);
                return;
            }
        }
       return;
    }

    public void setCaptain(Player player) {
        for (int i = 0; i < qtdPlayer; i++) {
            if (time[i] == player) {
                captain = player;
                return;
            }
        }
    }

    public Player[] fieldPlayer(){
        Player[] playersInField = new Player[qtdPlayer];
        int contador = 0;
        for (int i = 0; i < qtdPlayer; i++) {
            if (time[i].isFielded()){
                playersInField[contador] = time[i];
                contador++;
            }
        }
        return playersInField;
    }

    public Player[] getOutField(){
        Player[] playersInField = new Player[qtdPlayer];
        int contador = 0;
        for (int i = 0; i < qtdPlayer; i++) {
            if (!time[i].isFielded()){
                playersInField[contador] = time[i];
                contador++;
            }
        }
        return playersInField;
    }



    public Player[] getTime() {
        return time.clone();
    }
}
