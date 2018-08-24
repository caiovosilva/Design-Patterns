/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobridge;

import interfaces.IBackend;
import interfaces.IStage;

/**
 *
 * @author caiovosilva
 */
public class ExemploBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IStage stageOne = new StageOne();
        IBackend backendWin = new BackendWindows();
        IBackend backendLinux = new BackendLinux();
        
        stageOne.setBackend(backendWin);
        System.out.println(stageOne.init());
        
        stageOne.setBackend(backendLinux);
        System.out.println(stageOne.init());

    }
    
}
