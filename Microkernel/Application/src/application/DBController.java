package application;

import interfaces.IDBController;
import interfaces.ICore;

public class DBController implements IDBController{
    private ICore iCore;
    
    public boolean connectDB(){
        return true;
    }

    public void initialize(ICore icore) {
        this.iCore = icore;
    }
}
