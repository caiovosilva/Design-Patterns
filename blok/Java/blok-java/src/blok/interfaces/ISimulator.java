/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.interfaces;

import blok.utilities.GameBody;
import java.awt.Rectangle;

/**
 *
 * @author caiov
 */
public interface ISimulator {
    public void init();
    public void stop();
    public void start();
    public void removeBody(int bodyIndex);
}
