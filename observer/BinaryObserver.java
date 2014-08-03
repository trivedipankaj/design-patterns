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
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject)
    {
        this.subject = subject;
        subject.attach(this);
    }
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString( subject.getState()));
    }
    
}
