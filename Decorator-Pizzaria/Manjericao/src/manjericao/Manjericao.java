/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manjericao;

import interfaces.PizzaDecorator;

/**
 *
 * @author caiovosilva
 */
public class Manjericao  extends PizzaDecorator{

    public Manjericao(){
        ingrediente = "Manjericão";
    }
    
    @Override
    protected String adicinarIngrediente() {
        return ingrediente;
    }  

    @Override
    public String toString() {
        return ingrediente;
    }
}
