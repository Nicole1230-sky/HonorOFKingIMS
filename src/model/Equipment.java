package model;


public class Equipment {

    private String equipmentId;
    private String equipmentName;
    private String type; // Weapon / Armor / Accessory
    private int price;
    private int attackBonus;
    private int defenseBonus;

    // Default constructor
    public Equipment() {
    }

    // Parameterized constructor
    public Equipment(String equipmentId, String equipmentName, String type, int price) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.type = type;
        this.price = price;
        this.attackBonus = 0;
        this.defenseBonus = 0;
    }

    // Business logic
    public void upgrade() {
        this.attackBonus += 10;
        this.defenseBonus += 5;
        System.out.println(equipmentName + " upgraded! Attack+" + attackBonus + ", Defense+" + defenseBonus);
    }

    public void displayEquipmentInfo() {
        System.out.println("====== Equipment ======");
        System.out.println("ID: " + equipmentId);
        System.out.println("Name: " + equipmentName);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Attack Bonus: " + attackBonus);
        System.out.println("Defense Bonus: " + defenseBonus);
        System.out.println("======================");
    }

    // Getters and Setters
    public String getEquipmentId() { return equipmentId; }
    public void setEquipmentId(String equipmentId) { this.equipmentId = equipmentId; }

    public String getEquipmentName() { return equipmentName; }
    public void setEquipmentName(String equipmentName) { this.equipmentName = equipmentName; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getAttackBonus() { return attackBonus; }
    public void setAttackBonus(int attackBonus) { this.attackBonus = attackBonus; }

    public int getDefenseBonus() { return defenseBonus; }
    public void setDefenseBonus(int defenseBonus) { this.defenseBonus = defenseBonus; }
}
