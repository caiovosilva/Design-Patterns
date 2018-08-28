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
public class Camisa implements IComponent{

    public Camisa(){
        price = 10;
    }
    @Override
    public void risePrice(double percentage) {
        price += (percentage*price)/100;
        System.out.println("novo valor da camisa: "+price);
    }
    
    private double price;
}
