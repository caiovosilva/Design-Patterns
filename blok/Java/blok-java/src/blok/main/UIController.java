/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.main;

import blok.utilities.GameBody;
import interfaces.ICore;
import interfaces.IGameBody;
import interfaces.IUIController;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.ArrayList;
import org.jbox2d.common.Vec2;

/**
 *
 * @author caiovosilva
 */
public class UIController implements IUIController {
    
    public UIController(ICore core){
        m_core = core;
        m_mainWindow = new MainWindow();
        Dimension size = new Dimension(1000, 600);
        
        m_mainPanel = new MainPanel(core);
        m_mainPanel.setPreferredSize(size);
        m_mainPanel.setMinimumSize(size);
        m_mainPanel.setMaximumSize(size);
        m_mainPanel.setSize(size);
        m_mainWindow.setContentPane(m_mainPanel);
              
        m_mainWindow.setResizable(false);
        m_mainWindow.pack();   
        m_mainWindow.setVisible(true);       
    }    
    
    
    
    @Override
    public void bodiesCreated(ArrayList<IGameBody> bodies) {
        m_mainPanel.bodiesCreated(bodies);
    }
    private MainWindow m_mainWindow;
    private MainPanel m_mainPanel;
    private ICore m_core;

    @Override
    public void bodiesUpdated(ArrayList<IGameBody> bodies) {
        m_mainPanel.bodiesUpdated(bodies);
    }

    @Override
    public void setPlayerImage(String str) {
        m_mainPanel.setPlayerImage(str);
    }

    @Override
    public void update() {
        m_mainPanel.repaint();
    }
}
