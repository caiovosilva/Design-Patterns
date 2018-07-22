/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.interfaces;

import blok.utilities.GameBody;
import java.util.ArrayList;


/**
 *
 * @author caiov
 */
public interface IUIController {
   
    public void bodiesCreated(ArrayList<GameBody> bodies);
    public void bodiesUpdated(ArrayList<GameBody> bodies);
    public void setPlayerImage(String str);
    public void update();
}
