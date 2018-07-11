package application;

import interfaces.IDBController;
import interfaces.ICore;

public class DBController implements IDBController{
    private ICore core;
    
    public DBController(ICore core){
        this.core = core;
    }
    
    public boolean connectDB(){
        return true;
    }
}
