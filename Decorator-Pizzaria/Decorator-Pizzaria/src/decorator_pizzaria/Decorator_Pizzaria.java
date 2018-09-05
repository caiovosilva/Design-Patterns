/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_pizzaria;

import interfaces.PizzaDecorator;
import java.awt.Dimension;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author caiovosilva
 */
public class Decorator_Pizzaria {

    public Decorator_Pizzaria(){
        
    }
    
    public static void main(String[] args) {
        loadDecoratorPlugins();
        ArrayList<String> plugins = getloadedPluginsNames();
        m_mainWindow = new MainWindow();
        Dimension size = new Dimension(600, 300);
        
        m_mainPanel = new MainPanel(loadedDecoratorPlugins);
        m_mainPanel.setPreferredSize(size);
        m_mainPanel.setMinimumSize(size);
        m_mainPanel.setMaximumSize(size);
        m_mainPanel.setSize(size);
        
        m_mainWindow.setContentPane(m_mainPanel);                   
        m_mainWindow.setResizable(false);
        m_mainWindow.pack();   
        m_mainWindow.setVisible(true);    
//        PizzaSimples pizzaSimples = new PizzaSimples();
//        PizzaDecorator pizzaManjericao = new ManjericaoDec();
//        pizzaManjericao.setDecorated(pizzaSimples);
//        System.out.println(pizzaManjericao.decorar());
    }
    
    
    private static void loadDecoratorPlugins(){
        loadedDecoratorPlugins = new ArrayList<PizzaDecorator>();
        
        File currentDir = new File("./plugins");
        ArrayList<String> lPluginsNames = new ArrayList<>();
        for(File file : currentDir.listFiles()){
            if(!file.isDirectory())
                lPluginsNames.add(file.getName());
        }
        URL[] jars = new URL[lPluginsNames.size()];
        URLClassLoader m_ulc;
        for (int i = 0; i < lPluginsNames.size(); i++){
            try {
                URI uri = (new File("./plugins/" + lPluginsNames.get(i))).toURI();
                jars[i] = uri.toURL();
                m_ulc = new URLClassLoader(jars);
                String lName = lPluginsNames.get(i).split("\\.")[0];
                loadedDecoratorPlugins.add((PizzaDecorator) Class.forName(lName.toLowerCase() + "." + lName, true, m_ulc).newInstance()); 
            }
            catch (MalformedURLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Decorator_Pizzaria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static ArrayList<String> getloadedPluginsNames(){
        ArrayList<String> lPlugins = new ArrayList<String>();
        for(PizzaDecorator plugin : loadedDecoratorPlugins)
            lPlugins.add(plugin.getClass().getName().split("\\.")[1]);
        return lPlugins;
    }
    
    private static MainWindow m_mainWindow;
    private static MainPanel m_mainPanel;
    private static ArrayList<PizzaDecorator> loadedDecoratorPlugins;
}
