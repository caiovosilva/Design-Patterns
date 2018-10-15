/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author caiovosilva
 */
public abstract class ITemplateHamburger {
    public void descricaoHamburguer(){
        System.out.println("Pão");
        System.out.println("Carne");
        complementoHamburguer();
    }
    
    protected abstract void complementoHamburguer();
}
