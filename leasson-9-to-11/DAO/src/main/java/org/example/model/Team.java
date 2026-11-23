package org.example.model;

import java.util.Objects;

public class Team {
    final private Integer id;
    final private String name;
    final private String baseLocation;
    private String coachName;

    public Team(Integer id, String name, String baseLocation, String coachName) {
        this.id = id;
        this.name = name;
        this.baseLocation = baseLocation;
        this.coachName = coachName;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBaseLocation() {
        return baseLocation;
    }

    public String getCoachName() {
        return coachName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name) && Objects.equals(baseLocation, team.baseLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, baseLocation);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", baseLocation='" + baseLocation + '\'' +
                ", coachName='" + coachName + '\'' +
                '}';
    }
}
