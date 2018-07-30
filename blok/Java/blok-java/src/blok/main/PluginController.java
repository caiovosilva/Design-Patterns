/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.main;

import concreteclasses.Plugin;
import interfaces.IPluginController;
import interfaces.ISimulator;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import interfaces.AbstractThemeFactory;
import interfaces.ISimulatorFactoryMethod;

/**
 *
 * @author caiovosilva
 */
public class PluginController implements IPluginController{
    
    public PluginController() {
        File currentDir = new File("./plugins");
        ArrayList<String> lPluginsNames = new ArrayList<>();
        for(File file : currentDir.listFiles()){
            if(!file.isDirectory())
                lPluginsNames.add(file.getName());
        }
        URL[] jars = new URL[lPluginsNames.size()];
        for (int i = 0; i < lPluginsNames.size(); i++){
            try {
                URI uri = (new File("./plugins/" + lPluginsNames.get(i))).toURI();
                jars[i] = uri.toURL();
                m_ulc = new URLClassLoader(jars);
                String lName = lPluginsNames.get(i).split("\\.")[0];
                m_loadedPlugins.add((Plugin) Class.forName(lName.toLowerCase() + "." + lName, true, m_ulc).newInstance()); 
            }
            catch (MalformedURLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override   
    public ISimulatorFactoryMethod getLoadedSimulatorFactory(){
        return m_currentFactorySimulator;
    }
    
    @Override       
    public void loadSimulatorFactory(String pluguinName) {
        ISimulatorFactoryMethod simulator = null;
        try {
            simulator = (ISimulatorFactoryMethod) Class.forName(pluguinName.toLowerCase() + "." + pluguinName, true, m_ulc).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        m_currentFactorySimulator = simulator;              
    }
    
    @Override       
    public void loadTheme(String pluguinName) {
        AbstractThemeFactory factory = null;
        try {
            factory = (AbstractThemeFactory) Class.forName(pluguinName.toLowerCase() + "." + pluguinName, true, m_ulc).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        m_currentTheme = factory;              
    }
    
    @Override
    public AbstractThemeFactory getCurrentTheme() {
        return m_currentTheme;
    }
    
    @Override
     public ArrayList<String> getloadedPluginsNamesByType(Class pClass){
        ArrayList<String> lPlugins = new ArrayList<String>();
        for(Plugin plugin : m_loadedPlugins)
            if(pClass.isInstance(plugin))
                lPlugins.add(plugin.getClass().getName().split("\\.")[1]);
        return lPlugins;
    }
    
    private URLClassLoader m_ulc;
    private AbstractThemeFactory m_currentTheme; 
    private ISimulatorFactoryMethod m_currentFactorySimulator;
    private ArrayList<Plugin> m_loadedPlugins = new ArrayList<Plugin>();

}
