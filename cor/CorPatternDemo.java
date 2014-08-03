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
public class CorPatternDemo {
    
    private static AbstractLogger getChainOfLoggers()
    {
     AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
     AbstractLogger consoleLogger = new ErrorLogger(AbstractLogger.DEBUG);
     AbstractLogger fileLogger = new ErrorLogger(AbstractLogger.INFO);
     errorLogger.setNextLogger(fileLogger);
     fileLogger.setNextLogger(consoleLogger);
     return errorLogger;
     
    }
    
    public static void main(String[] args){
     AbstractLogger loggerChain = getChainOfLoggers();
     loggerChain.logMessage(AbstractLogger.INFO, "This is just information");
    
    }
}
