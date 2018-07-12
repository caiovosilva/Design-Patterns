package interfaces;

public interface ICore{
    public IPluginController getPluginController();
    public IUIController getUIController();
    public IDBController getDBController();
    public void initializeControllers();
}
