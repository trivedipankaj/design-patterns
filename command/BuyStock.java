/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.command;

/**
 *
 * @author Pankaj
 */
public class BuyStock implements Order{
    public Stock abcStock;
    
    public BuyStock(Stock abcStock)
    {
        this.abcStock = abcStock;
    }
    public void execute()
    {
        abcStock.buy();
    }   
}
