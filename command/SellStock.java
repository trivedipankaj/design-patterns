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
public class SellStock implements Order {
    public Stock abcStock;
    public SellStock(Stock abcStock)
    {
        this.abcStock = abcStock;
    }
    public void execute()
    {
        abcStock.sell();
    }
}
