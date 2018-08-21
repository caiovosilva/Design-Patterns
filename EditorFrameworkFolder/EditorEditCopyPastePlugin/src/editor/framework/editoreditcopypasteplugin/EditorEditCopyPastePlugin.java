/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package editor.framework.editoreditcopypasteplugin;

import editor.framework.interfaces.ICore;
import editor.framework.interfaces.IPlugin;

/**
 *
 * @author sandroandrade
 */
public class EditorEditCopyPastePlugin  implements IPlugin {

    @Override
    public void initialize() {
        System.out.println("Initializing example plugin");
        ICore.getInstance().getUiController().addMenuItem("Edit", new javax.swing.JMenuItem("Copy"));
    }
    
}
