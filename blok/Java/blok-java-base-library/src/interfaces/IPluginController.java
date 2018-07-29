/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import concreteclasses.Plugin;
import java.util.ArrayList;
import themeFactory.AbstractThemeFactory;

/**
 *
 * @author caiovosilva
 */
public interface IPluginController {
    public void loadTheme(String factoryName);
    public void loadSimulator(String simulatorName);
    public AbstractThemeFactory getCurrentTheme();
    public ISimulator getLoadedSimulator();
    public ArrayList<String> getloadedPluginsNamesByType(Class pClass);
}
