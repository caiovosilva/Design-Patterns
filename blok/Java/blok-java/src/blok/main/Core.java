/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.main;

import interfaces.ICore;
import interfaces.IGameController;
import interfaces.ISimulator;
import interfaces.IUIController;



public class Core implements ICore{


    public Core(){
        m_uiController = new UIController(this);
        m_gameController = new GameController(this);
        m_simulatorController = new Simulator(this);
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
    
    private ISimulator m_simulatorController;
    private IUIController m_uiController;
    private IGameController m_gameController;
}
