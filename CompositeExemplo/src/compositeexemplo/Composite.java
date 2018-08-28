/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeexemplo;

import interfaces.IComponent;
import java.util.ArrayList;

/**
 *
 * @author caiovosilva
 */
public class Composite implements IComponent{

    public Composite(){
        components = new ArrayList<>();
    }
    
    @Override
    public void risePrice(double percentage) {
        for(IComponent component : components){
            component.risePrice(percentage);
        }
    }
    
    public void addComponent(IComponent component){
        components.add(component);
    }
    
    public void removeComponent(IComponent component){
        components.remove(component);
    }
    
    private ArrayList<IComponent> components;
}
