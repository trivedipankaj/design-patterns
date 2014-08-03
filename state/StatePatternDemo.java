/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.state;

/**
 *
 * @author Pankaj
 */
public class StatePatternDemo {
    public static void main(String[] args){
        Context context = new Context();
        StartState start = new StartState();
        start.doAction(context);
        System.out.println(context.getState().toString());
        
        StopState stop = new StopState();
        stop.doAction(context);
        System.out.println(context.getState().toString());
        
    }
}
