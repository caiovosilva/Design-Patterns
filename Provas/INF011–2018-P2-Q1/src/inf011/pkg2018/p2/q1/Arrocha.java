/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf011.pkg2018.p2.q1;

import interfaces.IBanda;
import interfaces.IMusica;

/**
 *
 * @author caiovosilva
 */
public class Arrocha extends IMusica{

    public Arrocha(IBanda banda) {
        super(banda);
    }

    @Override
    public void play() {
        banda.tocarBaixo();
        banda.tocarGuitarra();
        banda.tocarBateria();
        System.out.println("Tocando Arrocha");
    }
    
}
