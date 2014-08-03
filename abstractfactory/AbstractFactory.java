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
public abstract class AbstractFactory {
       abstract Shape getShape(String shape);
       abstract Color getColor(String color);
}
