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
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice)
    {
        if(choice ==null)
        {
            return null;
        }
        if(choice.equalsIgnoreCase("SHAPE"))
        {
            return new ShapeFactory();
        }
        if(choice.equalsIgnoreCase("COLOR"))
        {
            return new ColorFactory();
        }
        return null;
    }
}
