package application;

import interfaces.IUIController;
import interfaces.ICore;

public class UIController implements IUIController {
    private ICore core;
    
    public UIController(ICore iCore){
        this.core= iCore;
    }
    
    public boolean createButton(boolean value){
        return value;
    }
}

