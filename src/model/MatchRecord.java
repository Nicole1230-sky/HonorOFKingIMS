package model;

public class MatchRecord {
    private String teamA;
    private String teamB;
    private String winningTeam;
    private String mvpHero;
    private int durationMinutes;

    public MatchRecord(String teamA, String teamB, String winningTeam, String mvpHero, int durationMinutes) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.winningTeam = winningTeam;
        this.mvpHero = mvpHero;
        this.durationMinutes = durationMinutes;
    }

    public String getWinningTeam() {
        return winningTeam;
    }

    public String getMvpHero() {
        return mvpHero;
    }
}