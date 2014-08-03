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
public class NameRepository {
    public String names[] ={"Ram","John","Sheldon","Lenord"};
    
    public Iterator getIterator()
    {
        return new NameIterator();
    }
    
    public class NameIterator implements Iterator
    {
        int index;
        public boolean hasNext()
        {
            if(index <names.length)
            {
                return true;
            }
            return false;
        }
        public Object next()
        {
            if(this.hasNext())
            {
              return names[index++];
            }
            return null;
        }
    }
    
}
