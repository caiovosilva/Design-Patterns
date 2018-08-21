/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package editor.framework.interfaces;

/**
 *
 * @author sandroandrade
 */
public abstract class ICore {
    public static ICore getInstance()
    {
        return instance;
    }
    public abstract IUiController getUiController();
    public abstract IProjectController getProjectController();
    
    protected ICore() {}
    protected static ICore instance = null;
}
