package test;

import static org.junit.Assert.*; // This imports all static methods like assertNotNull, assertTrue, etc.
import org.junit.Test;

import main.Character;
import main.Warrior;
import main.Mage;
import main.Archer;
import main.CharacterFactory;

public class CharacterFactoryTest {

    @Test
    public void testCreateWarrior() {
        Character warrior = CharacterFactory.createCharacter("warrior");
        assertNotNull(warrior); // Ensures warrior is not null
        assertTrue(warrior instanceof Warrior); // Ensures warrior is an instance of Warrior
    }

    @Test
    public void testCreateMage() {
        Character mage = CharacterFactory.createCharacter("mage");
        assertNotNull(mage);
        assertTrue(mage instanceof Mage);
    }

    @Test
    public void testCreateArcher() {
        Character archer = CharacterFactory.createCharacter("archer");
        assertNotNull(archer);
        assertTrue(archer instanceof Archer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateUnknownCharacter() {
        Character unknown = CharacterFactory.createCharacter("unknown");
    }
}
