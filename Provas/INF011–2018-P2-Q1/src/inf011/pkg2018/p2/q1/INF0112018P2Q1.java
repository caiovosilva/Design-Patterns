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
public class INF0112018P2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IBanda bandaEletrica = new BandaEletrica();
        IBanda bandaAcustica = new BandaAcustica();
        
        IMusica pagode = new Pagode(bandaEletrica);
        pagode.play();
        System.out.println();
        pagode.setBanda(bandaAcustica);
        pagode.play();
        System.out.println();

        
        IMusica arrocha = new Arrocha(bandaAcustica);
        arrocha.play();
        System.out.println();
        arrocha.setBanda(bandaEletrica);
        arrocha.play();
    }
    
}
