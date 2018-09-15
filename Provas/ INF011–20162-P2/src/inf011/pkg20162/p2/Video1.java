/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf011.pkg20162.p2;

import interfaces.IVideo;

/**
 *
 * @author caiovosilva
 */
public class Video1 extends IVideo{

    @Override
    public void play() {
        codec.play();
        System.out.println("tocando video 1");
    }  
}
