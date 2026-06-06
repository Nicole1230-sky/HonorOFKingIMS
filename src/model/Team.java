package model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Player> members = new ArrayList<>();
    private List<Hero> heroes = new ArrayList<>();
    private int wins;
    private int losses;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void addMember(Player player) {
        if (!members.contains(player)) {
            members.add(player);
        }
    }

    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    public void recordWin() {
        wins++;
    }

    public void recordLoss() {
        losses++;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }
}