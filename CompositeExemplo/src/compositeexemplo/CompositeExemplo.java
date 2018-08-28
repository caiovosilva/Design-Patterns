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
public class CompositeExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IComponent arroz = new Arroz();
        IComponent feijao = new Feijao();
        Composite produtosAlimenticios = new Composite();
        produtosAlimenticios.addComponent(arroz);
        produtosAlimenticios.addComponent(feijao);
        
        IComponent camisa = new Camisa();
        IComponent shorts = new Shorts();
        Composite produtosVestuario = new Composite();
        produtosAlimenticios.addComponent(camisa);
        produtosAlimenticios.addComponent(shorts);
        
        Composite mercado = new Composite();
        mercado.addComponent(produtosAlimenticios);
        mercado.addComponent(produtosVestuario);
        
        mercado.risePrice(10);
    }
    
}
