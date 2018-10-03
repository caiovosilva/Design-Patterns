/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic.iterator;

import java.util.ArrayList;

/**
 *
 * @author caiovosilva
 */
public class Iterator {
    
    private ArrayList<Object> objects;
    int index;
    
    public Iterator() {
        index = 0;
        objects = new ArrayList<>();
    }
    
    public boolean hasNext() {   
        return index < objects.size();
    }

    public Object next() {
        if(this.hasNext())
           return objects.get(index++);
        return null;
    }	
    
    public boolean hasPrevious() {   
        return (objects.size()>0 && index > 1);
    }

    public Object previous() {
        if(this.hasNext())
           return objects.get(--index);
        return null;
    }
    
    public void add(Object obj){
        objects.add(obj);
    }
}
