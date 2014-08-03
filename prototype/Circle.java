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
public class Circle extends Shape {
    public Circle()
    {
        type = "Circle";
    }
    public void draw()
    {
        System.out.println("Drawing Circle");
    }
}
