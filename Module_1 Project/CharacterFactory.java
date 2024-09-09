public class CharacterFactory {
    public static Character createCharacter(String type, String name) {
        if (type.equals("warrior")) {
            return new Warrior(name);
        } else if (type.equals("mage")) {
            return new Mage(name);
        } else if (type.equals("archer")) {
            return new Archer(name);
        } else {
            throw new IllegalArgumentException("Invalid character type");
        }
    }
}
