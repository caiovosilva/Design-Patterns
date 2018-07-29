/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.main;

import concreteclasses.Plugin;
import interfaces.ICore;
import interfaces.IPluginController;
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
                String lName = lPluginsNames[i].split("\\.")[0];
                        m_ulc = new URLClassLoader(jars);

                Plugin plugin = ((Plugin)Class.forName(lName.toLowerCase() + "." + lName, true, m_ulc).newInstance());
                m_loadedPlugins.add(plugin); 
            }
            catch (MalformedURLException e) {
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (InstantiationException ex) {
                Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (IllegalAccessException ex) {
                Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        m_ulc = new URLClassLoader(jars);
    }
    
//    public String[] loadedThemes(){
//        return m_loadedThemes;
//    }
    
    @Override       
    public void loadTheme(String factoryName) {
        AbstractThemeFactory factory = null;
        try {
            try {
                factory = (AbstractThemeFactory) Class.forName(factoryName.toLowerCase() + "." + factoryName, true, m_ulc).newInstance();
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
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
    private ArrayList<Plugin> m_loadedPlugins = new ArrayList<Plugin>();

}
