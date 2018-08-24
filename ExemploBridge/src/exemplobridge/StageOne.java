/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobridge;

import interfaces.IStage;

/**
 *
 * @author caiovosilva
 */
public class StageOne extends IStage{

    @Override
    public boolean init() {
        if(backend==null)
            return false;
        return backend.draw() && backend.playAudio();
    }
    
}
