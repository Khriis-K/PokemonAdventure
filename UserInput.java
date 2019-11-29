import java.util.Scanner;
/**
 * Write a description of class UserInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInput
{
    /**
     * Verifies that one of the strings provided as arguments will be
     * returned.
     *
     * Example usage:
     * String input = User.getValidInput("yes", "no", "y", "n");
     *
     * Only yes, no, y, and n are valid inputs. If the user types anything
     * else, they will be prompted to re-enter.
     *
     */
    public static String getValidInput(String... validInputs)
    {
        String input = "";
        boolean valid = false;
        do
        {
            input = getLine().toLowerCase();
            for(String str : validInputs)
            {
                if(input.equals(str.toLowerCase()))
                    valid = true;
            }
            if(!valid)
                System.out.print("Invalid input. Please try again\n>");
        }
        while(!valid);
        return input;
    }

    public static String getLine()
    {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static int getInt()
    {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
}
