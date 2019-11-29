/**
 * Write a description of class Pokemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pokemon
{
    private String pokemonName;
    private String pokemonType;
    private String pokemonSecondaryType = "none";
    
    // stats
    private int health;
    private int attack;
    private int defense;
    private int speed;
    
    // faint;
    private boolean fainted = false;
    
    // weaknesses, resistances, immunities (strengths are handled by moves)
    private String[] weaknesses = {"none"};
    private String[] immunities = {"none"};
    private String[] resistances = {"none"};

    /**
     * Constructor for objects of class Pokemon
     */
    public Pokemon(String pokemonName)
    {
        this.pokemonName = pokemonName;
        
        // oh jeez, here we go...
        
        if (pokemonName.equals("Sceptile"))
        {
            pokemonType = "grass";
            health = (int)(Math.random()*95)+250;
            attack = (int)(Math.random()*139)+157;
            defense = (int)(Math.random()*131)+121;
            speed = (int)(Math.random()*153)+220;
            
            String[] sceptileWeaknesses = {"fire","ice","poison","flying","bug"};
            weaknesses = sceptileWeaknesses;
            String[] sceptileResistances = {"water","electric","grass","ground"};
            resistances = sceptileResistances;
        }
        else if (pokemonName.equals("Blaziken"))
        {
            pokemonType = "fire";
            pokemonSecondaryType = "fighting";
            health = (int)(Math.random()*95)+270;
            attack = (int)(Math.random()*153)+220;
            defense = (int)(Math.random()*133)+130;
            speed = (int)(Math.random()*137)+148;
            
            String[] blazikenWeaknesses = {"water","ground","flying","psychic"};
            weaknesses = blazikenWeaknesses;
            String[] blazikenResistances = {"fire","grass","ice","bug","dark","steel"};
            resistances = blazikenResistances;
        }
        else if (pokemonName.equals("Swampert"))
        {
            pokemonType = "water";
            pokemonSecondaryType = "ground";
            health = (int)(Math.random()*95)+310;
            attack = (int)(Math.random()*149)+202;
            defense = (int)(Math.random()*141)+166;
            speed = (int)(Math.random()*129)+112;
            
            String[] swampertWeaknesses = {"grass"};
            weaknesses = swampertWeaknesses;
            String[] swampertResistances = {"fire", "poison", "rock", "steel"};
            resistances = swampertResistances;
            String[] swampertImmunities = {"electric"};
            immunities = swampertImmunities;
        }
        else if (pokemonName.equals("Umbreon"))
        {
            pokemonType = "dark";
            health = (int)(Math.random()*95)+300;
            attack = (int)(Math.random()*131)+121;
            defense = (int)(Math.random()*157)+238;
            speed = (int)(Math.random()*131)+121;
            
            String[] umbreonWeaknesses = {"fighting", "bug", "fairy"};
            weaknesses = umbreonWeaknesses;
            String[] umbreonResistances = {"Ghost", "Dark"};
            resistances = umbreonResistances;
            String[] umbreonImmunities = {"psychic"};
            immunities = umbreonImmunities;
        }
    }
    
    public String[] getWeaknesses()
    {
        return weaknesses;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public int getAttack()
    {
        return attack;
    }
    
    public int getDefense()
    {
        return defense;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public String getName()
    {
        return pokemonName;
    } 
}
