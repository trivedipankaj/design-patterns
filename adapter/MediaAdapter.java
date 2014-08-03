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
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;
    public MediaAdapter(String audioType)
    {
        if(audioType.equals("vlc"))
        {
            advancedMusicPlayer = new VlcPlayer();
        }else if(audioType.equals("mp4"))
        {
            advancedMusicPlayer = new Mp4Player();
        }
    }
    public void play(String audioType, String fileName)
    {
        if(audioType.equals("vlc"))
        {
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equals("mp4"))
        {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
