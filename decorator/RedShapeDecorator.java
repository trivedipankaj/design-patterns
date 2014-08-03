/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.decorator;

/**
 *
 * @author Pankaj
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape)
    {
        super(decoratedShape);
    }
    public void draw()
    {
      decoratedShape.draw();
      setRedBorder(decoratedShape);
    }
    
    public void setRedBorder(Shape decoratedShape)
    {
        System.out.println("Border Color:Red");
    }
}
