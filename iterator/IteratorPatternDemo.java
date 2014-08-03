/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.iterator;

/**
 *
 * @author Pankaj
 */
public class IteratorPatternDemo {
    public static void main(String[] args)
    {
        NameRepository namesRepository = new NameRepository();
        for(Iterator iter= namesRepository.getIterator(); iter.hasNext();)
        {
            System.out.println("Name: "+ (String) iter.next());
        }
    }
    
}
