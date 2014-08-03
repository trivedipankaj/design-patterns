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
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI)
    {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
