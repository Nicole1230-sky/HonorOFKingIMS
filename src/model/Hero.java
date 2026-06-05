package model;

/**
 * Hero represents a champion owned by a Player.
 */
public class Hero {

    private String heroName;
    private String role;      // 战士 / 法师 / 射手
    private int level;
    private int hp;
    private int attack;
    private int defense;

    public Hero() {
        this.level = 1;
        this.hp = 1000;
        this.attack = 100;
        this.defense = 50;
    }

    public Hero(String heroName, String role) {
        this();
        this.heroName = heroName;
        this.role = role;
    }

    // ===== Getter / Setter =====

    public String getHeroName() {
        return heroName;
    }

    public String getRole() {
        return role;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    // ===== 行为 =====

    public void levelUp() {
        this.level++;
        this.hp += 100;
        this.attack += 20;
        this.defense += 10;
        System.out.println(heroName + " 升级！当前等级：" + level);
    }

    public void displayHeroInfo() {
        System.out.println("====== 英雄 ======");
        System.out.println("名称: " + heroName);
        System.out.println("职业: " + role);
        System.out.println("等级: " + level);
        System.out.println("生命: " + hp);
        System.out.println("攻击: " + attack);
        System.out.println("防御: " + defense);
        System.out.println("==================");
    }
}