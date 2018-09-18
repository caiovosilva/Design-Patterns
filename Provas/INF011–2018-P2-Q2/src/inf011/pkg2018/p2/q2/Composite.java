/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf011.pkg2018.p2.q2;

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
    
    public Composite(IComponent component){
        this();
        addComponent(component);
    }
    
    public void addComponent(IComponent component){
        components.add(component);
    }
    
    public void removeComponent(IComponent component){
        components.remove(component);
    }
    
    private ArrayList<IComponent> components;

    @Override
    public void afinar() {
        for(IComponent component : components)
            component.afinar();       
    }

    @Override
    public void tocar() {
        for(IComponent component : components)
            component.tocar();
    }
}