/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.memento;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Pankaj
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();
    
    public void add(Memento memento)
    {
        mementoList.add(memento);            
    }
    public Memento get(int index)
    {
        return mementoList.get(index);
    }
}
