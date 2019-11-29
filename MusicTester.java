import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
/**
 * Write a description of class MusicTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MusicTester
{
    public static void main(String[] args)
    {
        
        File Music = new File("IntroMusic.WAV");
        Music music = new Music();
        music.playSound(Music);
        Story.stopFrickenTime(2000);
        music.stopSound();
        
    }
}
