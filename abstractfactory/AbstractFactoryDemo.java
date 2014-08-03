/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.abstractfactory;

/**
 *
 * @author Pankaj
 */
public class AbstractFactoryDemo {
    public static void main(String[] args)
    {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");
        color1.fill();
        
    }
}
