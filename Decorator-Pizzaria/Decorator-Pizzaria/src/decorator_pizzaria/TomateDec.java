/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_pizzaria;

import interfaces.PizzaDecorator;

/**
 *
 * @author caiovosilva
 */
public class TomateDec extends PizzaDecorator{

    @Override
    protected String adicinarIngrediente() {
        return "Tomate";
    }
    
}
