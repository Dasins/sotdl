
/**
 *
 * @author d4s1ns
 * @version v2018-05-23
 */
public class Character {
    // Nivel inicial del personaje.
    private final static int LVL_INIT = 1;
    // Nivel máximo del personaje.
    private final static int LVL_MAX = 10;
    
    // ID del personaje (Ej: MOR001). 
    private final String id;
    // Nivel del personaje.
    private int lvl;
    // Nombre del personaje.
    private String name;
    // Atributos del personaje.
    private Features features;
    
    /**
     * Constructor - Crea un personaje de nivel 1 sin nombre.
     * @param id Identificador unico del personaje.
     */
    public Character(String id, Features features) {
        this.id = id;
        lvl = LVL_INIT;
        name = null;
        this.features =  features;
    }
    
    /**
     * Devuelve el id del personaje.
     * @return Devuelve el id del personaje.
     */
    public String getId() {
        return id;
    }
    
    /**
     * Devuelve el nivel del personaje.
     * @return Devuelve el nivel del personaje.
     */
    public int getLvl() {
        return lvl;
    }
    
    /**
     * Sustituye el nivel del personaje por el nivel indicado por parametro.
     * Si el nuevo nivel supera el nivel maximo, no hace nada.
     * @param lvl Nuevo nivel del personaje.
     */
    public void setLvl(int lvl) {
        if(lvl > LVL_MAX)
        this.lvl = lvl;
    }
    
    /**
     * Devuelve el nombre del personaje.
     * @return Devuelve el nombre del personaje.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sustituye el nombre del personaje por el nombre indicado por parametro.
     * @param name Nuevo nombre del personaje.
     */
    public void setName(String name) {
        this.name = name;
    }
       
}
