/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.composite;

/**
 *
 * @author Pankaj
 */
public class CompositePatternDemo {
    public static void main(String[] args)
    {
        Employee CEO = new Employee("John","CEO",40000);
        Employee headSales = new Employee("Robert","Head Sales",30000);
        Employee headMarketing = new Employee("John","Head Marketing",30000);
        CEO.add(headSales);
        CEO.add(headMarketing);
        System.out.println(CEO);
        for(Employee emp:CEO.getSubordinates())
        {
            System.out.println(emp);
        }
        
    }
}
