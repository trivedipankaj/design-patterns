/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.observer;

/**
 *
 * @author Pankaj
 */
public class ObserverPatternDemo {
    public static void main(String[] args)
    {
        Subject subject = new Subject();
        
         new BinaryObserver(subject);
         new HexaObserver(subject);
         new OctalObserver(subject);
         
         System.out.println("First State: 15");
         subject.setState(15);
         
         System.out.println("Second State: 10");
         subject.setState(10);
         
    }
}
