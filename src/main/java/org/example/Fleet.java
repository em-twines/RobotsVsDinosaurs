package org.example;

public class Fleet {
    public String name;
    public Robot robot;
    public Robot robot1;
    public Robot robot2;
    public int health;

    public Fleet(String name) {
        this.robot = new Robot("Hal", "Electric Shock", 15);
        this.robot1 = new Robot("Bender", "Electric Shock", 15);
        this.robot2 = new Robot("The Singularity", "Electric Shock", 15);
        this.health = 300;
    }


}
