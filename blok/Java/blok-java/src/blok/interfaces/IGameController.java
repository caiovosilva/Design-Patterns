/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.interfaces;

/**
 *
 * @author caiovosilva
 */
public interface IGameController {
     enum State {
        INITIAL, 
        RUNNING, 
        YOUWON, 
        YOULOST
    }

    public void setState(IGameController.State currencyVal);
    public State getState();
    void playWav(final String wavFile,final int times);
}
