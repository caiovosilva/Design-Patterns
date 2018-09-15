/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf011.pkg20162.p2;

import interfaces.IVideo;
import interfaces.VideoDecorator;

/**
 *
 * @author caiovosilva
 */
public class PropagandaAntes extends VideoDecorator{
    
    public PropagandaAntes(IVideo decorated){
        super(decorated);
    }

    @Override
    public void play() {
        System.out.println("tocando propaganda 1");
        decorated.play();
    }
}
