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
public class Decorator_Pizzaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PizzaSimples pizzaSimples = new PizzaSimples();
        PizzaDecorator pizzaManjericao = new ManjericaoDec();
        pizzaManjericao.setDecorated(pizzaSimples);
        System.out.println(pizzaManjericao.decorar());
    }
    
}
