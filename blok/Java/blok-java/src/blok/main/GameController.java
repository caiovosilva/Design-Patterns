/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.main;

import interfaces.ICore;
import interfaces.IGameController;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author caiovosilva
 */
public class GameController implements IGameController{
    
    public GameController(ICore core){
            m_core = core;
            playWav("sounds/background.wav", -1);
    }
    
    public void setState(State state) { 
        m_state = state;
        switch(m_state) {
            case INITIAL:
                m_core.getUIController().setPlayerImage("images/player" + Math.abs((new Random()).nextInt()%9) + ".png");
                m_core.getSimulator().init();
                m_core.getSimulator().stop();
                break;
            case RUNNING:
                m_core.getSimulator().start();
                break;
        }
        m_core.getUIController().restart();
    }

    @Override
    public State getState() {
        return m_state;
    }
    
    @Override
    public void playWav(final String wavFile, final int times) {
        (new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                System.out.println(AudioSystem.getMixerInfo()[1].getName());
                Clip clip = AudioSystem.getClip();
                AudioInputStream ais = AudioSystem.getAudioInputStream(new File(wavFile));
                clip.open(ais);
                clip.loop(times);
            } catch (MalformedURLException ex) {
                Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }})).start();
    }
    
    private ICore m_core;   
    private State m_state = State.INITIAL;

}
