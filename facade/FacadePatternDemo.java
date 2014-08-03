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
public class FacadePatternDemo {
    public static void main(String[] args)
    {
      ShapeMaker shapeMaker = new ShapeMaker();
      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();
    }
}
