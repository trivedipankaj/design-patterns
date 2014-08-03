/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.builder;

/**
 *
 * @author Pankaj
 */
public class Coke  extends ColdDrink{

    @Override
    public float price() {
        return 25.0f;
    }
    public String name()
    {
        return "Coke";
    }
    
}
