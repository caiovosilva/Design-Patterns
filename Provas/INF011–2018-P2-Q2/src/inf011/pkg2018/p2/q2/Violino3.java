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
public class Violino3 implements IComponent{

    @Override
    public void afinar() {
        System.out.println("Afinando violino 3.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Violino 3.");
    }
}
