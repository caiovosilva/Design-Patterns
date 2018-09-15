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
public class PropagandaDepois extends VideoDecorator{

    public PropagandaDepois(IVideo video) {
        super(video);
    }

    @Override
    public void play() {
        decorated.play();
        System.out.println("tocando propaganda depois");
    }
    
}
