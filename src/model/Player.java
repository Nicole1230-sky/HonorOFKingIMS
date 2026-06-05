package model;

import java.util.UUID;
import java.util.ArrayList;
import java.util.List;
/**
 * Player represents a player in HonorOfKings IMS.
 * Currently not inheriting Person to avoid compilation errors.
 */
public class Player {
private List<Hero> heroes;
    private String playerId;
    private String name;
    private int age;
    private String nickname;
    private int rank;
    private int wins;
    private int losses;
    private int coins;
    private int status;

    public Player() {
        this.playerId = UUID.randomUUID().toString();
        this.rank = 1;
        this.wins = 0;
        this.losses = 0;
        this.coins = 1000;
        this.status = 0;
        this.heroes=new ArrayList<>();
    }

    public Player(String name, int age, String nickname) {
        this();
        this.name = name;
        this.age = age;
        this.nickname = nickname;
    }
    public void addHero(Hero hero) {
        this.heroes.add(hero);
        System.out.println(nickname + " 获得了英雄：" + hero.getHeroName());
    }

    public void showHeroes() {
        System.out.println(nickname + " 拥有的英雄：");
        for (Hero h : heroes) {
            h.displayHeroInfo();
        }
    }
    // ===== Getter / Setter =====

    public String getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    public int getRank() {
        return rank;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getCoins() {
        return coins;
    }

    public int getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    // ===== 行为 =====

    public void addWin() {
        wins++;
        if (wins % 10 == 0) {
            rank++;
            System.out.println(nickname + " 升段了！当前段位：" + rank);
        }
    }

    public void addLoss() {
        losses++;
    }

    public void rewardCoins(int amount) {
        coins += amount;
        System.out.println(nickname + " 获得 " + amount + " 金币！");
    }

    public boolean spendCoins(int amount) {
        if (coins >= amount) {
            coins -= amount;
            return true;
        }
        System.out.println("金币不足！");
        return false;
    }

    public void displayInfo() {
        System.out.println("====== 玩家 ======");
        System.out.println("ID: " + playerId);
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("昵称: " + nickname);
        System.out.println("段位: " + rank);
        System.out.println("战绩: " + wins + "胜 / " + losses + "负");
        System.out.println("金币: " + coins);
        System.out.println("==================");
    }
}