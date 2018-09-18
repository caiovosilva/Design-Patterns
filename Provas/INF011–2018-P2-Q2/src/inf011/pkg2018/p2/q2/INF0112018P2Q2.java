/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf011.pkg2018.p2.q2;

import interfaces.IComponent;

/**
 *
 * @author caiovosilva
 */
public class INF0112018P2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Composite violino = new Composite();
        Composite cordas = new Composite(violino);
        Composite sopro = new Composite();
        Composite percussao = new Composite();
        Composite orquestra = new Composite();
        
        orquestra.addComponent(sopro);
        orquestra.addComponent(percussao);
        orquestra.addComponent(cordas);
        
        IComponent violino1 = new Violino1();
        IComponent violino2 = new Violino2();
        IComponent violino3 = new Violino3();
        IComponent sopro1 = new Sopro1();
        IComponent percussao1 = new Percussao1();
        
        violino.addComponent(violino1);
        violino.addComponent(violino2);
        violino.addComponent(violino3);
        sopro.addComponent(sopro1);
        percussao.addComponent(percussao1);
        
        orquestra.afinar();
        System.out.println();
        
        cordas.tocar();
        System.out.println();
        
        percussao.tocar();
    }
    
}
