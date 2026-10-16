package player;

import java.util.List;
import java.util.Objects;

public class Player {
    final private String userName;
    private List<Integer> gameScore;

    public Player(String userName) {
        this.userName = userName;
    }


    public void addScore(int score){

    }

    public int compareTo(Player player){
        return 1;
    }





    public String getUserName() {
        return userName;
    }

    public List<Integer> getGameScore() {
        return gameScore;
    }

    public void setGameScore(List<Integer> gameScore) {
        this.gameScore = gameScore;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(userName, player.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userName);
    }

    @Override
    public String toString() {
        return "Player{" +
                "userName='" + userName + '\'' +
                ", gameScore=" + gameScore +
                '}';
    }


}
