/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import interfaces.ICore;

/**
 *
 * @author caiov
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ICore core = new Core();
        System.out.println(core);
        System.out.println(core.getDBController());
        System.out.println(core.getPluginController());
        System.out.println(core.getUIController());
    }
    
}
