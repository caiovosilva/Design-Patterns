/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.main;

import interfaces.ICore;
import interfaces.IPluginController;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import themeFactory.AbstractThemeFactory;

/**
 *
 * @author caiovosilva
 */
public class PluginController implements IPluginController{
    
    public PluginController(ICore core) {
        m_core = core;    
        File currentDir = new File("./plugins");
        m_loadedThemes = currentDir.list();     
        URL[] jars = new URL[m_loadedThemes.length];
        for (int i = 0; i < m_loadedThemes.length; i++){
            try {
                URI uri = (new File("./plugins/" + m_loadedThemes[i])).toURI();
                jars[i] = uri.toURL();
                m_loadedThemes[i] = m_loadedThemes[i].split("\\.")[0];
            }
            catch (MalformedURLException e) {
            }
        }
        m_ulc = new URLClassLoader(jars);
        if(m_loadedThemes.length>0)
            loadTheme(m_loadedThemes[0]);
    }
    
    public String[] loadedThemes(){
        return m_loadedThemes;
    }
    
    @Override       
    public void loadTheme(String factoryName) {
        AbstractThemeFactory factory = null;
        try {
            try {
                factory = (AbstractThemeFactory) Class.forName(factoryName.toLowerCase() + "." + factoryName, true, m_ulc).newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        createProducts(factory);
    }
    
    private void createProducts(AbstractThemeFactory factory) {
        m_currentTheme = factory;
    }

    public AbstractThemeFactory getCurrentTheme() {
        return m_currentTheme;
    }
    
    private ICore m_core;
    private URLClassLoader m_ulc;
    private AbstractThemeFactory m_currentTheme; 
    private String[] m_loadedThemes;
}
