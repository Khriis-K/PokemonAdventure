
/**
 * Write a description of class ExampleGameRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExampleGameRunner
{
  public static void main(String[] args)
  {
    System.out.print("What is your name?\n");
    String name = UserInput.getLine();
    System.out.println("Hi " + name + ", let's start!");

    ExampleStory s = new ExampleStory();
    s.start();
  }
}
