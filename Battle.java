/**
 * Write a description of class Battles here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battle
{
    private static Pokemon playerPokemon;
    private static Pokemon opponentPokemon;
    private int playerPokemonHealth;
    private int opponentPokemonHealth;
    
    private int turns;
    private boolean pokemonLeft = true;

    /**
     * Constructor for objects of class Battles
     */
    public Battle(Pokemon player, Pokemon opponent)
    {
        playerPokemon = player;
        playerPokemonHealth = playerPokemon.getHealth();
        opponentPokemon = opponent;
        opponentPokemonHealth = opponentPokemon.getHealth();
        
        
        System.out.println("Go! " + playerPokemon.getName() + "!");
        Story.stopFrickenTime(2500);
        planMove();
        
        if (playerPokemon.getSpeed() >= opponentPokemon.getSpeed())
        {
            playerTurn();
        }
        else
        {
            opponentTurn();
        }
    }
    
    public static void planMove()
    {
        System.out.println("What will " + playerPokemon.getName() + " do?");
        String input = UserInput.getValidInput()
    }
    
    
}
