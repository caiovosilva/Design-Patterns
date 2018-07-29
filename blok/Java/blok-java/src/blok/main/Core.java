/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.main;

import interfaces.ICore;
import interfaces.IGameController;
import interfaces.IPluginController;
import interfaces.ISimulator;
import interfaces.IUIController;



public class Core implements ICore{


    public Core(){
        m_gameController = new GameController(this);
        m_pluginController = new PluginController();
        m_simulatorController = m_pluginController.getLoadedSimulator();
        m_uiController = new UIController(this);      
        m_simulatorController.init();
    }
    @Override
    public ISimulator getSimulator() {
        return m_simulatorController;
    }

    @Override
    public IUIController getUIController() {
        return m_uiController;
    }
    
    @Override
    public IGameController getGameController(){
        return m_gameController;
    }
    
    @Override
    public IPluginController getPluginController(){
        return m_pluginController;
    }
    
    private ISimulator m_simulatorController;
    private IUIController m_uiController;
    private IGameController m_gameController;
    private IPluginController m_pluginController;
}
