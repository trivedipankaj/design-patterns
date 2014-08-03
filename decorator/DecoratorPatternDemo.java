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
public class DecoratorPatternDemo {
    public static void main(String[] args)
    {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("Circle with red border");
        redCircle.draw();
        System.out.println("Rectangle with red border");
        redRectangle.draw();
        
        
    }
}
