/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.bridge;

/**
 *
 * @author Pankaj
 */
public class GreenCircle implements DrawAPI{
    public void drawCircle(int radius, int x, int y)
    {
        System.out.println("Drawing Circle: [color:green, radius: "+radius + "x=" + x + "y" + y);
    }
}