/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.proxy;

/**
 *
 * @author Pankaj
 */
public class RealImage implements Image{
    private String fileName;
    
    public RealImage(String fileName)
    {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    
    public void display()
    {
        System.out.println("Displaying Real Image");
    }
    public void loadFromDisk(String fileName)
    {
        System.out.println("Loading file from disk :" + fileName);
    }
    
}
