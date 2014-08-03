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
public class Circle extends Shape{
    private int x,y,radius;
    public Circle(int x, int y, int radius, DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y =y;
        this.radius = radius;
    }
    
    public void draw(){
     drawAPI.drawCircle(radius, x, y);
    }
}
