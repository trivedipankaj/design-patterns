/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.facade;

/**
 *
 * @author Pankaj
 */
public class ShapeMaker {
    private Shape rectangle;
    private Shape circle;
    private Shape square;
    
    public ShapeMaker()
    {
        rectangle = new Rectangle();
        circle    = new Circle();
        square    = new Square();
    }
    
    public void drawCircle()
    {
        circle.draw();
    }
    public void drawRectangle()
    {
        rectangle.draw();
    }
    
    public void drawSquare()
    {
        square.draw();
    }
    
}
