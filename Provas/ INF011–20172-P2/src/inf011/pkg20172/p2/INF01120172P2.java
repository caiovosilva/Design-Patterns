/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf011.pkg20172.p2;

import interfaces.IComponent;

/**
 *
 * @author caiovosilva
 */
public class INF01120172P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Composite pequeno = new Composite();
        Composite verde = new Composite(pequeno);
        Composite caju = new Composite(verde);
        Composite frutas = new Composite(caju);
 
        IComponent cajuVerdePequeno = new CajuVerdePequeno();
        pequeno.addComponent(cajuVerdePequeno);
        
        pequeno.listar();
        pequeno.realizarLimpeza();
        pequeno.listar();
    }
    
}
