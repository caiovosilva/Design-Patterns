/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author caiovosilva
 */
public interface IUIController {
   
    public void bodiesCreated(ArrayList<IGameBody> bodies);
    public void bodiesUpdated(ArrayList<IGameBody> bodies);
    public void setPlayerImage(String str);
    public void update();
}