package org.example;

public class Herd {
    public String name;
    public Dinosaur dinosaur;
    public Dinosaur dinosaur1;
    public Dinosaur dinosaur2;
    public int health;

    public Herd(String name) {
        this.dinosaur = new Dinosaur("K-T", "Brutal Bite", 25);
        this.dinosaur1 = new Dinosaur("Rex", "Brutal Bite", 25);
        this.dinosaur2 = new Dinosaur("Little Foot", "Brutal Bite", 25);

        this.health = 300;
    }

}
