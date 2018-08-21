/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package editor.framework.shell;

import editor.framework.interfaces.ICore;
import editor.framework.interfaces.IPlugin;
import editor.framework.interfaces.IProjectController;
import editor.framework.interfaces.IUiController;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sandroandrade
 */
public class Core extends ICore {

    public static void initialize()
    {
        if (instance == null)
            instance = new Core();
    }
    @Override
    public IUiController getUiController() {
        return uiController;
    }

    @Override
    public IProjectController getProjectController() {
        return projectController;
    }
    
    protected Core()
    {
        uiController = new UiController();
        projectController = new ProjectController();
    }

    public static void initPlugins()
    {
        File currentDir = new File("./plugins");
        String []plugins = currentDir.list();
        int i;
        URL[] jars = new URL[plugins.length];
        for (i = 0; i < plugins.length; i++)
        {
          System.out.println(i+1 + " - " + plugins[i].split("\\.")[0]);
            try {
                jars[i] = (new File("./plugins/" + plugins[i])).toURL();
            } catch (MalformedURLException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        URLClassLoader ulc = new URLClassLoader(jars);
        for (i = 0; i < plugins.length; i++)
        {
            String factoryName = plugins[i].split("\\.")[0];
            try {
                IPlugin plugin = (IPlugin) Class.forName("editor.framework." + factoryName.toLowerCase() + "." + factoryName, true, ulc).newInstance();
                plugin.initialize();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private UiController uiController;
    private ProjectController projectController;
}
