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
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 22.0f;
    }
    
    public String name()
    {
        return "Veg Burger";
    }
}
