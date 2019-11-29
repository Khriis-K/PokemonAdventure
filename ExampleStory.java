
public class ExampleStory
{
    private int timesProcastinated;
    
    public ExampleStory()
    {
        timesProcastinated = 0;
    }
    
    public void start()
    {
        System.out.println("You find yourself sitting in front of a computer. You have work to do. \n" +
                            "But also, there is the INTERNET. What do you do? Work or go online?");
    
        String input = UserInput.getValidInput("work", "I work", "internet", "browse the internet", "go online");
    
        if(input.equals("internet") || input.equals("browse the internet") || input.equals("go online"))
        {
          timesProcastinated++;
          if(Math.random() < 0.5)
          {
            System.out.println("You browse twitter and get very mad online.");
          }
          else
          {
            System.out.println("You obsessively check your fantasy basketball team's performance.");
          }
          wait(2000);
          start();
        }
        else
        {
          System.out.println("You choose to get some work done.");
          wait(2000);
          work();
        }
    }
    
    public void work()
    {
        System.out.println("You decide it's finally time to record your lessons for the week. \n" +
                            "How do you want to make your story? Meta or serious?");
    
        String input = UserInput.getValidInput("meta", "serious");
    
        if(input.equals("meta"))
        {
          System.out.println("You decide to write a story about recording your lessons.");
          wait(2000);
          ending1();
        }
        else
        {
          System.out.println("You decide to write a very SERIOUS story with seriousness involved.");
          wait(2000);
          ending2();
        }
    }
    
    public void ending1()
    {
        String times ="times";
        if(timesProcastinated == 1)
        {
          times = "time";
        }
        System.out.println("After procastinating " + timesProcastinated + " " + times + ",\n" +
                            "you decide to be asuper funny like the funny person you are and \n" +
                            "record a very meta story.");
        wait(2000);
        System.out.println("Everybody loved it. The end.");
    }
    
    public void ending2()
    {
        String times ="times";
        if(timesProcastinated == 1)
        {
          times = "time";
        }
        System.out.println("After procastinating " + timesProcastinated + " " + times + ",\n" +
                            "it apparently wasn't enough because it wasn't late enough to be silly \n" +
                            "enough to do something meta.");
        wait(2000);
        System.out.println("How boring. Everyone is disappointed in you. The end.");
    }
    
      /**
     * Will delay output for the number of milliseconds provided as an argument
     */ 
    private void wait(int milliseconds)
    {
        try {
            Thread.sleep(milliseconds);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
