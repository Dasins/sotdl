 /**
 * 
 * @author d4s1ns
 * @version v2018-05-23
 */
public class Features {
    // PRIMARY FEATURES.
    private int strength;
    private int agility;
    private int wisdown;
    private int intellect;
    
    // SECONDARY FEATURES.
    private int healRate;
    private int defense;
    private int movement;
    private int damage;
    
    public Features(int strength, int agility, int wisdown, int intellect) {
        this.agility = agility;
        this.wisdown = wisdown;
        this.intellect = intellect;
        this.strength = strength;
    }
    
}
