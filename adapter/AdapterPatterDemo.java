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
public class AdapterPatterDemo {
    public static void main(String[] args)
    {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "first.mp3");
        audioPlayer.play("mp4", "second.mp4");
        audioPlayer.play("vlc", "third.mp3");
        audioPlayer.play("avi", "four.avi");
        
    }
}
