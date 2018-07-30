/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author caiovosilva
 */
public interface AbstractThemeFactory {
    public AbstractBrickProduct createBrick();
    public AbstractFloorProduct createFloor();
    public AbstractBackgroundProduct createBackground();
}
