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
import themeFactory.AbstractThemeFactory;

/**
 *
 * @author caiovosilva
 */
public class PluginController implements IPluginController{
    
    public PluginController() {
        File currentDir = new File("./plugins");
        String[] lPluginsNames = currentDir.list();     
        URL[] jars = new URL[lPluginsNames.length];
        for (int i = 0; i < lPluginsNames.length; i++){
            try {
                URI uri = (new File("./plugins/" + lPluginsNames[i])).toURI();
                jars[i] = uri.toURL();
                m_ulc = new URLClassLoader(jars);
                String lName = lPluginsNames[i].split("\\.")[0];
                Plugin plugin = ((Plugin) Class.forName(lName.toLowerCase() + "." + lName, true, m_ulc).newInstance());
                m_loadedPlugins.add(plugin); 
            }
            catch(NullPointerException e){
                System.out.println(e.fillInStackTrace());
            }
            catch (MalformedURLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override   
    public ISimulator getLoadedSimulator(){
        return m_currentSimulator;
    }
    
    @Override       
    public void loadSimulator(String pluguinName) {
        ISimulator simulator = null;
        try {
            simulator = (ISimulator) Class.forName(pluguinName.toLowerCase() + "." + pluguinName, true, m_ulc).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        m_currentSimulator = simulator;              
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
    private ISimulator m_currentSimulator;
    private ArrayList<Plugin> m_loadedPlugins = new ArrayList<Plugin>();

}
