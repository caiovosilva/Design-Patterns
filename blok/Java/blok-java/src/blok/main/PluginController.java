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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import themeFactory.AbstractBackgroundProduct;
import themeFactory.AbstractBrickProduct;
import themeFactory.AbstractFloorProduct;
import themeFactory.AbstractThemeFactory;

/**
 *
 * @author caiovosilva
 */
public class PluginController implements IPluginController{
    
    public PluginController(ICore core) {
        m_core = core;
        
        File currentDir = new File("./plugins");
        String []plugins = currentDir.list();
//        String []pl = currentDir.list(); 
//        String []plugins = new String[pl.length-1];
//        for (int i = 1; i < pl.length; i++)
//            if(!pl[i].equalsIgnoreCase("lib"))
//                plugins[i]=pl[i];       
        URL[] jars = new URL[plugins.length];
        for (int i = 0; i < plugins.length; i++){
            try {
                URI uri = (new File("./plugins/" + plugins[i])).toURI();
                jars[i] = uri.toURL();
            }
            catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        m_ulc = new URLClassLoader(jars);
        if(plugins.length>0)
            loadTheme(plugins[0]);
    }
  
    public void loadTheme(String factoryName) {
        AbstractThemeFactory factory = null;
        try {
            try {
                factoryName  = factoryName.split("\\.")[0];
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
        currentFloorProduct = factory.createFloorProduct();
        currentBrickProduct = factory.createBrickProduct();
        currentBackgroundProduct = factory.createBackgroundProduct();
    }
    
    public AbstractFloorProduct getCurrentFloorProduct() {
        return currentFloorProduct;
    }

    public AbstractBrickProduct getCurrentBrickProduct() {
        return currentBrickProduct;
    }

    public AbstractBackgroundProduct getCurrentBackgroundProduct() {
        return currentBackgroundProduct;
    }
    private ICore m_core;
    private URLClassLoader m_ulc;
    private AbstractFloorProduct currentFloorProduct;
    private AbstractBrickProduct currentBrickProduct;
    private AbstractBackgroundProduct currentBackgroundProduct;

    
}
