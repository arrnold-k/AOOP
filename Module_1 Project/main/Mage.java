package main;

public class Mage implements Character {
    @Override
    public void attack() {
        System.out.println("Mage casts a fireball!");
    }

    @Override
    public void defend() {
        System.out.println("Mage conjures a magical barrier!");
    }
}
