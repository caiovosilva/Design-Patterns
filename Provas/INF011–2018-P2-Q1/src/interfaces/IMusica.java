/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author caiovosilva
 */
public abstract class IMusica {

    public abstract void play();
    
    public IMusica (IBanda banda) {
        setBanda(banda);
    }
    
    public void setBanda(IBanda banda) {
        this.banda = banda;
    }
    
    protected IBanda banda;
}
