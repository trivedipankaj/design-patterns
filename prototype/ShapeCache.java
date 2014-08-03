/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.prototype;

import java.util.Hashtable;

/**
 *
 * @author Pankaj
 */
public class ShapeCache {
    public static Hashtable<String, Shape> shapeMap 
            = new Hashtable<String,Shape>();
    
    public static Shape getShape(String shapeId)
    {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    
    public static void loadCache()
    {
     Circle circle = new Circle();
     circle.setId("1");
     shapeMap.put(circle.getId(), circle);
     
     Square square = new Square();
     square.setId("2");
     shapeMap.put(square.getId(), square);
     
     Rectangle rectangle = new Rectangle();
     rectangle.setId("3");
     shapeMap.put(rectangle.getId(), rectangle);
     
     
    }
}
