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
public class BandaEletrica implements IBanda{

    @Override
    public void tocarBateria() {
        System.out.println("Tocando bateria da banda elétrica.");
    }

    @Override
    public void tocarGuitarra() {
        System.out.println("Tocando guitarra da banda elétrica.");
    }

    @Override
    public void tocarBaixo() {
        System.out.println("Tocando baixo da banda elétrica.");
    }
    
}
