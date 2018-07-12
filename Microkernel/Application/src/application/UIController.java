package application;

import interfaces.IUIController;
import interfaces.ICore;

public class UIController implements IUIController {
    private ICore iCore;
    
    public void initialize(ICore iCore) {
        this.iCore = iCore;
    }
    
    public boolean createButton(boolean value){
        return value;
    }
}

