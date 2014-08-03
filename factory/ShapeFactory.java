/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.factory;

/**
 *
 * @author Pankaj
 */
public class ShapeFactory {
    
    public Shape getShape(String shapeType)
    {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equals("CIRCLE"))
        {
            return new Circle();
        }
        if(shapeType.equals("SQUARE"))
        {
            return new Square();
        }
        if(shapeType.equals("RECTANGLE"))
        {
            return new Rectangle();
        }
        return null;
    }
}
