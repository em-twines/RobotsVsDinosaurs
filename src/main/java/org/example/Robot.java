package org.example;

public class Robot implements Attacker {

    public String name;
    public String attack;

    public int attackPower;
    public Robot(String name, String attack, int attackPower){
        this.name = name;
        this.attack = attack;
        this.attackPower = 15;

    }

    @Override
    public void Attack() {
    }
}