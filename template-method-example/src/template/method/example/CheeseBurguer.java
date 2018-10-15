/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.method.example;

import interfaces.ITemplateHamburger;

/**
 *
 * @author caiovosilva
 */
public class CheeseBurguer extends ITemplateHamburger {

    @Override
    protected void complementoHamburguer() {
        System.out.println("Queijo");
    }

    
}
