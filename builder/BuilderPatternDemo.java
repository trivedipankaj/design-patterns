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
public class BuilderPatternDemo {
    public static void main(String[] args)
    {
        MealBuilder mealbuilder = new MealBuilder();
        Meal vegmeal = mealbuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegmeal.showItems();
        
        Meal nonvegmeal = mealbuilder.prepareNonVegMeal();
        System.out.println("Non-Veg Meal");
        nonvegmeal.showItems(); 
        
        
    }
    
}
