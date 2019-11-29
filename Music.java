import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


/**
 * Write a description of class Music here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Music
{
    Clip clip;
    public void playSound(File Sound)
    {
        try
        {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            //Thread.sleep(clip.getMicrosecondLength()/1000);
        }
        catch(Exception e)
        {
            e.printStackTrace(); 
        }
    }
    public void stopSound()
    {
        clip.stop();
    }
    public void loopSound()
    {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    
}
