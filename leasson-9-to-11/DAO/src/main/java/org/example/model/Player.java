package org.example.model;

import java.util.Objects;

public class Player {
    final private String id;
    final private String name;
    private int number;
    private String position;
    private boolean isField;

    public Player(String id, int number, String name) {
        this.id = id;
        this.number = number;
        this.name = name;
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

    public boolean isField() {
        return isField;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return number == player.number && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", position='" + position + '\'' +
                ", isField=" + isField +
                '}';
    }
}
