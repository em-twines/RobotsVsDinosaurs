package org.example;

public class Dinosaur implements Attacker {
    public String name;
    public String attack;
    public int attackPower;
    public Dinosaur(String name, String attack, int attackPower) {
        this.name = name;
        this.attack = attack;
        this.attackPower = 15;

    }
    @Override
    public void Attack() {

    }
}
