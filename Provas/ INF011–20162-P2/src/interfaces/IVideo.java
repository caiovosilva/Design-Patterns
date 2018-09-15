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
public abstract class IVideo {
    
    public void setCodec(ICodec codec) {
        this.codec = codec;
    }
    
    public abstract void play();
    
    protected ICodec codec;
}
