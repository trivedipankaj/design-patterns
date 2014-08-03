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
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }
    public int exectueStrategy(int num1, int num2)
    {
        return strategy.doOperation(num1, num2);
    }
}
