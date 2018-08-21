/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package editorframework;

import editor.framework.shell.Core;

/**
 *
 * @author sandroandrade
 */
public class Main {
    public static void main(String[] args)
    {
        Core.initialize();   
        Core.initPlugins();
    }
}
