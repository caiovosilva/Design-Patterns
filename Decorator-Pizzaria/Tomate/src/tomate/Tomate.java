/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomate;

import interfaces.PizzaDecorator;

/**
 *
 * @author caiovosilva
 */
public class Tomate extends PizzaDecorator{

    public Tomate() {
        ingrediente = "Tomate";
    }
    
    @Override
    public String toString(){
        return ingrediente;
    }
}
