/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.strategy;

/**
 *
 * @author Pankaj
 */
public class StrategyPatternDemo {
    public static void main(String[] args)
    {
      Context context = new Context(new OperationAdd());
      System.out.println("10 + 5 = " + context.exectueStrategy(10, 5));
      context = new Context(new OperationSubstract());
      System.out.println("10 - 5 = " + context.exectueStrategy(10, 5));
      context = new Context(new OperationMultiply());
      System.out.println("10 *5 = " + context.exectueStrategy(10, 5));
      
    }
}
