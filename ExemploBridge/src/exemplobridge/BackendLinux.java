/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobridge;

import interfaces.IBackend;

/**
 *
 * @author caiovosilva
 */
public class BackendLinux implements IBackend{

    @Override
    public boolean playAudio() {
        System.out.print("tocando audio no linux");
        return true;
    }

    @Override
    public boolean draw() {
        return true;
    }
    
}
