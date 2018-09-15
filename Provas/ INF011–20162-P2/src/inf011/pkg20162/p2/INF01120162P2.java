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
public class INF01120162P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IVideo video1 = new Video1();
        video1.setCodec(new Codec1());
        VideoDecorator videoComPropaganda = new PropagandaAntes(new PropagandaDepois(video1));
        videoComPropaganda.play();

    }
    
}
