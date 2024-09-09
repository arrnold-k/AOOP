public class Main {
    public static void main(String[] args) {
        Character warrior = CharacterFactory.createCharacter("warrior", "Aragorn");
        Character mage = CharacterFactory.createCharacter("mage", "Gandalf");
        Character archer = CharacterFactory.createCharacter("archer", "Legolas");

        System.out.println("Warrior: " + warrior.getName() + " (Health: " + warrior.getHealth() + ", Damage: " + warrior.getDamage() + ")");
        System.out.println("Mage: " + mage.getName() + " (Health: " + mage.getHealth() + ", Damage: " + mage.getDamage() + ")");
        System.out.println("Archer: " + archer.getName() + " (Health: " + archer.getHealth() + ", Damage: " + archer.getDamage() + ")");

        try {
            CharacterFactory.createCharacter("invalid", "Invalid");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
