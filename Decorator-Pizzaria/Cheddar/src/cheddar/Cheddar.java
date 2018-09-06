/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheddar;

import interfaces.PizzaDecorator;

/**
 *
 * @author caiovosilva
 */
public class Cheddar extends PizzaDecorator{

    public Cheddar() {
        ingrediente = "Queijo Cheddar";
    }
    
    @Override
    public String toString(){
        return ingrediente;
    }
}
