/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.flyweight;

import java.util.HashMap;

/**
 *
 * @author Pankaj
 */
public class ShapeFactory {
    private static final HashMap<String,Shape> circleMap = new  HashMap<String,Shape>();
    
    public static Shape getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);
        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of the color"+color);
        }
        return circle;
    }
}
