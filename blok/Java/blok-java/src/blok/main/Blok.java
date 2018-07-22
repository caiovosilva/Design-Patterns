/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.main;

import interfaces.ICore;


/**
 *
 * @author caiovosilva
 */
public class Blok {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ICore core = new Core();
            }
        });
    }
}
