/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypeexample;

import interfaces.IPrototype;

/**
 *
 * @author caiov
 */
public class PrototypeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlexiblePrototype flexibleProto = new FlexiblePrototype();
        Pneu pneu = new Pneu(13, "luxo");
        Chassi chassi = new Chassi(5,"luxo");
        flexibleProto.addPrototype("Pneu", pneu);
        flexibleProto.addPrototype("Chassi", chassi);
        IPrototype clonePneu = flexibleProto.create("Pneu");
        IPrototype cloneChassi = flexibleProto.create("Chassi");
                
        System.out.println(clonePneu);
        System.out.println(cloneChassi);
    }
    
}
