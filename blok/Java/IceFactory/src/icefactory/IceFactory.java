/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icefactory;

/**
 *
 * @author caiov
 */
import themeFactory.*;
/**
 *
 * @author caiovosilva
 */
public class IceFactory implements AbstractThemeFactory{

    @Override
    public AbstractBrickProduct createBrick() {
        return new IceBrick();
    }

    @Override
    public AbstractFloorProduct createFloor() {
        return new IceFloor();
    }

    @Override
    public AbstractBackgroundProduct createBackground() {
        return new IceBackground();
    }
    
}
