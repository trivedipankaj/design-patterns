/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.singleton;

/**
 *
 * @author Pankaj
 */
public class SingleObject {
    
    private static SingleObject instance  = new SingleObject();
    private SingleObject() {}
    
    public static SingleObject getInstance()
    {
        return instance;
    }
    public void ShowMessage()
    {
        System.out.println("From Singleton");
    }
}
