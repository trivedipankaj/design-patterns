/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.prototype;

/**
 *
 * @author Pankaj
 */
public class Rectangle extends Shape {
    public Rectangle()
    {
        type = "Rectangle";
    }
    public void draw()
    {
        System.out.println("Drawing Rectangle");
    }
}
