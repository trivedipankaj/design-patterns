/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.adapter;

/**
 *
 * @author Pankaj
 */
public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    public void play(String audioType, String fileName)
    {
     if(audioType.equalsIgnoreCase("mp3"))
     {
         System.out.println("Playing mp3 file. Name:" +fileName);
     }else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4"))
     {
         mediaAdapter = new MediaAdapter(audioType);
         mediaAdapter.play(audioType, fileName);
     }
    }
}
