import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterTest {

    @Test
    public void testWarriorCreation() {
        Character warrior = CharacterFactory.createCharacter("warrior", "Aragorn");
        assertEquals("Aragorn", warrior.getName());
        assertEquals(120, warrior.getHealth());
        assertEquals(20, warrior.getDamage());
    }

    @Test
    public void testMageCreation() {
        Character mage = CharacterFactory.createCharacter("mage", "Gandalf");
        assertEquals("Gandalf", mage.getName());
        assertEquals(80, mage.getHealth());
        assertEquals(30, mage.getDamage());
    }

    @Test
    public void testArcherCreation() {
        Character archer = CharacterFactory.createCharacter("archer", "Legolas");
        assertEquals("Legolas", archer.getName());
        assertEquals(100, archer.getHealth());
        assertEquals(25, archer.getDamage());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCharacterType() {
        CharacterFactory.createCharacter("invalid", "Invalid");
    }
}
