package application;

import interfaces.IUIController;
import interfaces.IDBController;
import interfaces.IPluginController;
import interfaces.ICore;

public class Core implements ICore {
    private IPluginController pluginController;
    private IDBController dbController;
    private IUIController uiController;
    
    public Core(){
        initializeControllers();
    }
    
    public IPluginController getPluginController(){
        return this.pluginController;
    }
    
    public IDBController getDBController(){
        return this.dbController;
    }
    
    public IUIController getUIController(){
        return this.uiController;
    }

    public void initializeControllers() {
        this.pluginController = new PluginController();
        this.dbController = new DBController();
        this.uiController = new UIController();
        this.pluginController.initialize(this);
        this.dbController.initialize(this);
        this.uiController.initialize(this);
    }
}