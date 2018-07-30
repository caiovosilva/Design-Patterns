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
import interfaces.AbstractFloorProduct;
import interfaces.AbstractBrickProduct;
import interfaces.AbstractThemeFactory;
import interfaces.AbstractBackgroundProduct;
import concreteclasses.Plugin;
/**
 *
 * @author caiovosilva
 */
public class IceFactory extends Plugin implements AbstractThemeFactory{

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
