/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf011.pkg2018.p2.q1;

import interfaces.IBanda;

/**
 *
 * @author caiovosilva
 */
public class BandaAcustica implements IBanda{

    @Override
    public void tocarBateria() {
        System.out.println("Tocando bateria da banda acustica.");
    }

    @Override
    public void tocarGuitarra() {
        System.out.println("Tocando guitarra da banda acustica.");
    }

    @Override
    public void tocarBaixo() {
        System.out.println("Tocando baixo da banda acustica.");
    }
    
}
