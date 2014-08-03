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
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;
    
    public ProxyImage(String fileName)
    {
        this.fileName = fileName;
    }
    public void display()
    {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
