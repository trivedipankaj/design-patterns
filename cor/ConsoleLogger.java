/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.cor;

/**
 *
 * @author Pankaj
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level)
    {
      this.level = level;
    }
    protected void write(String message)
    {
        System.out.println("Standard Console Logger :" + message);
    }
}
