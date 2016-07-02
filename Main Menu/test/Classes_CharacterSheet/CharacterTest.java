/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_CharacterSheet;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jay_d_000
 */
public class CharacterTest {
    
    public CharacterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getEquip method, of class Character.
     */
    @Test
    public void testGetEquip() {
        System.out.println("getEquip");
        Character instance = new Warrior();
        String expResult = "Longsword, " + "Shield, "
                + "Mail Armor";
        String result = instance.getEquip();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSkills method, of class Character.
     */
    @Test
    public void testGetSkills() {
        System.out.println("getSkills");
        Character instance = new Warrior();
        String expResult = "Weapon Skill: Swords, "
                + "Weapon Skill: Shields, "
                + "Armor Skill: Heavy";
        String result = instance.getSkills();
        assertEquals(expResult, result);
    }
    
}
