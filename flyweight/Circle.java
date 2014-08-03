/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.flyweight;

/**
 *
 * @author Pankaj
 */
public class Circle implements Shape {
    private String color;
    private int radius;
    private int x;
    private int y;
    public Circle(String color)
    {
        this.color = color;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    public void draw()
    {
        System.out.println("Drawing circle [color:"+color + "x:"+x+"y:"+y+"radius:"+ radius+"]");
    }
}
