/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.gui;

import blok.interfaces.IUIController;

/**
 *
 * @author sandroandrade
 */
public class Blok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                IUIController mainWindow = new MainWindow();
                //mainWindow.setVisible(true);
            }
        });
    }
}
