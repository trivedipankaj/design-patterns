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
public class Blue implements Color{

    @Override
    public void fill() {
        System.out.println("Filling the shape with blue");
    }
    
}
