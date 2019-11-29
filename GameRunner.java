public class GameRunner
{
    private static String starter;
    public static void main(String[] args)
      {
       
        System.out.println("Welcome to the world of Pokemon! Just a few things before we get you started.");
        System.out.println("Tell us your name, please.");
        String name = UserInput.getLine();
        System.out.println("Alright " + name + ", and lastly pick an element: grass, fire, or water?");
        String element = UserInput.getValidInput("grass", "fire", "water");
        if (element.equals("grass"))
        {
            starter = "Sceptile";
        }
        else if (element.equals("fire"))
        {
            starter = "Blaziken";
        }
        else
        {
            starter = "Swampert";
        }
        
        Story s = new Story();
        s.start(starter);
    }
}


