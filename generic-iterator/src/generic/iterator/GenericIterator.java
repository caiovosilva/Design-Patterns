/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic.iterator;

/**
 *
 * @author caiovosilva
 */
public class GenericIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Iterator iterator = new Iterator();
        Person person = new Person();
        Person person2 = new Person();
        iterator.add(person);
        iterator.add(person2);
        
        Object ob = iterator.next();
        Person p1 = (Person)iterator.next();
    }
    
}
