package main;

public class MainApp {
    public static void main(String[] args) {
        // Example usage of CharacterFactory
        Character warrior = CharacterFactory.createCharacter("warrior");
        System.out.println("Created a " + warrior.getClass().getSimpleName());
    }
}