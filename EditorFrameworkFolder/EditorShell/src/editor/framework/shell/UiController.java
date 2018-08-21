/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package editor.framework.shell;

import editor.framework.interfaces.IUiController;
import javax.swing.JMenuItem;

/**
 *
 * @author sandroandrade
 */
public class UiController implements IUiController {

    public UiController()
    {
        mainWindow = new MainWindow();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainWindow.setVisible(true);
            }
        });
    }
    public JMenuItem addMenuItem(String menuText, JMenuItem item) {
        return mainWindow.addMenuItem(menuText, item);
    }
    
    private MainWindow mainWindow;
}
