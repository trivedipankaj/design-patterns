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
public class ColorFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if(color == null) 
        {
            return null;
        }
        if(color.equalsIgnoreCase("RED"))
        {
            return new Red();
        }
        if(color.equalsIgnoreCase("GREEN"))
        {
            return new Green();
        }
        if(color.equalsIgnoreCase("BLUE"))
        {
            return new Blue();
        }
      return null;
    }
    
}
