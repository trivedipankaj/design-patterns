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
public class Square extends Shape {
    public Square()
    {
        type = "Square";
    }
    public void draw()
    {
        System.out.println("Drawing Square");
    }
}
