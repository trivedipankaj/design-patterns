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
public class Mp4Player implements AdvancedMediaPlayer{
    
    public void playVlc(String fileName) {
    
    }

    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 file. Name:"+fileName);
    }
    
}
