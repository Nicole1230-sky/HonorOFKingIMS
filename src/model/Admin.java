package model;

/**
 * Admin represents a system administrator.
 * This is a standalone class with no dependencies to avoid compilation errors.
 */
public class Admin {

    // 属性
    private String adminId;
    private String name;
    private int age;
    private String role;
    private String permissionLevel;

    // 构造方法
    public Admin() {
        this.permissionLevel = "NORMAL";
    }

    public Admin(String adminId, String name, int age, String role) {
        this.adminId = adminId;
        this.name = name;
        this.age = age;
        this.role = role;
        this.permissionLevel = "NORMAL";
    }

    // 行为
    public void banPlayer(String playerName) {
        System.out.println("Admin " + this.name + " banned player: " + playerName);
    }

    public void displayAdminInfo() {
        System.out.println("Admin ID: " + adminId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
    }

    // Getter 和 Setter
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(String permissionLevel) {
        this.permissionLevel = permissionLevel;
    }
}