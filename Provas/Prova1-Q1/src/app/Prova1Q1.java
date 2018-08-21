/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import interfaces.IPrototype;

/**
 *
 * @author caiovosilva
 */
public class Prova1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlexiblePrototype flexibleProto =  FlexiblePrototype.getInstance();
        Pneu pneu = new Pneu(13, "luxo");
        Chassi chassi = new Chassi(5,"luxo");
        flexibleProto.addPrototype("Pneu", pneu, 2, 4);
        flexibleProto.addPrototype("Chassi", chassi,0,3);

        IPrototype cloneChassi = flexibleProto.create("Chassi");
        IPrototype m1 = flexibleProto.create("Pneu"); // Retorna a 1a instância, já criada
        IPrototype m2 = flexibleProto.create("Pneu"); // Retorna a 2a instância, já criada
        IPrototype m3 = flexibleProto.create("Pneu"); // Realiza a 1a instanciação (3o pneu)
        IPrototype m4 = flexibleProto.create("Pneu"); // Realiza a 2a instanciação (4o pneu)
    }
    
}
