/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package editor.framework.interfaces;

import javax.swing.JMenuItem;

/**
 *
 * @author sandroandrade
 */
public interface IUiController {
    public abstract JMenuItem addMenuItem(String menuText, javax.swing.JMenuItem item);
}
