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
public abstract class VideoDecorator extends IVideo{
    
    public VideoDecorator(IVideo video) {
        this.decorated = video;
    }
    public void setDecorated(IVideo decorated) {
        this.decorated = decorated;
    }
    
    protected IVideo decorated;
}
