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
public class ProxyPatternDemo {
    public static void main(String[] args)
    {
       Image image = new ProxyImage("test.png");
       image.display();
       image.display();
    }
}
