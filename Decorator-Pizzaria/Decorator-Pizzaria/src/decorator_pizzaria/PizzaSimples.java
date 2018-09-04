/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_pizzaria;

import interfaces.IComponent;

/**
 *
 * @author caiovosilva
 */
public class PizzaSimples implements IComponent{

    @Override
    public String decorar() {
        return " Massa + Molho + Queijo";
    }
    
}
