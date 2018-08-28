/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeexemplo;

import interfaces.IComponent;

/**
 *
 * @author caiovosilva
 */
public class Shorts implements IComponent{

    public Shorts(){
        price = 20;
    }
    @Override
    public void risePrice(double percentage) {
        price += (percentage*price)/100;
        System.out.println("novo valor do short: "+price);
    }
    
    private double price;
}
