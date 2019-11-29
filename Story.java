import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;

/**
 * Write a description of class Story here.
 *
 * @Connor 
 * @version (a version number or a date)
 */
public class Story
{
    private int usablePokemonInParty;
    private Pokemon slot1;
    private Pokemon slot2;
    private Pokemon slot3;
    private Pokemon slot4;
    private Pokemon slot5;
    private Pokemon slot6;
    
    private Music music;
    
    public Story()
    {
        usablePokemonInParty = 1;
        music = new Music();
    }

    //to play a song, use:
    //playMusic(SongName, "start")
    //top stop a song, use:
    //playMusic(SongName, "stop")
    public void start(String starter)
    {
        slot1 = new Pokemon(starter);
        playMusic("victoryRoad.WAV", "start"); //Start music
        playMusic("victoryRoad.WAV", "loop");
        slot1 = new Pokemon(starter);
        System.out.println("Thanks!");
        stopFrickenTime(4000);
        System.out.print('\u000C');
        System.out.println("You've almost made it. After months of traveling throughout Hoenn with your partner, " + starter + ", \n" +
                            "your dream of becoming the pokemon champion is just in reach."); 
        stopFrickenTime(5000);
        System.out.println("You've done a lot to get here. You beat Team Magma and Team Aqua. You beat all 8 gym leaders...");
        stopFrickenTime(3000);
        System.out.println("And you probably saved your game before each one...");
        stopFrickenTime(3000);
        System.out.println("but that doesn't matter! All that stands in your way is Victory Road, a mountain of deep caves, mazes, \n" +
                            "and elite trainers. Find and battle wild Pokemon to join your team along the way! Good Luck!");
        stopFrickenTime(7000);
        System.out.print('\u000C');
        enterStageOne();
    }
    
    public void enterStageOne()
    {
        // playMusic("victoryRoad.WAV", "stop"); //Stop music
        System.out.println("You enter the mountain and it's nearly pitch black. Your footsteps echo off the walls, so deep they are all you can \n"
                            + "hear. You come across two dark pathways...");
        stopFrickenTime(5000);              
        ImageIcon splitCave = new ImageIcon("images/splitCave.png");
        JOptionPane.showMessageDialog(null, "", "ooooo spooky", JOptionPane.PLAIN_MESSAGE, splitCave);
        System.out.println("Which way do you go?");
        String input = UserInput.getValidInput("left", "right", "I go left", "I go right");
        if (input.equals("left") || input.equals("I go left"))
        {
            umbreonBattle();
        }
        else
        {
            magnetonBattle();
        }
    }
    
    public void umbreonBattle()
    {
      System.out.println("test");
      ImageIcon umbreonImage = new ImageIcon("images/umbreon.png");
      JOptionPane.showMessageDialog(null, "A wild Umbreon Appears!", "Pokemon Battle", JOptionPane.PLAIN_MESSAGE, umbreonImage);
      Pokemon wildUmbreon = new Pokemon("Umbreon");
      for(int i = usablePokemonInParty; i>0; i--)
      {
          Battle umbreonBattle = new Battle(slot1, wildUmbreon);
      }
      if (battleWon()=true)
      {
          restoreHealth();
          System.out.println("Nice! Umbreon joined your team!");
      }
      else
      {
          restoreHealth();
          System.out.println("Oof... that didn't go so well. Have another shot at it!");
      }
    }
    
    public static void magnetonBattle()
    {
        
    }
    
    
    public static void stopFrickenTime(int milliseconds)
    {
        try {
            Thread.sleep(milliseconds);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void playMusic(String s, String StartStopLoop)
    {
        if(StartStopLoop.equals("start"))
        {
            File Music = new File(s);
            music.playSound(Music);
        }
        if(StartStopLoop.equals("stop"))
        {
            music.stopSound();
        }
        if(StartStopLoop.equals("loop"))
        {
            music.loopSound();
        }
    }

}
