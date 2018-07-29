/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standardfactory;

import concreteclasses.Plugin;
import themeFactory.*;
/**
 *
 * @author caiovosilva
 */
public class StandardFactory extends Plugin implements AbstractThemeFactory{

    @Override
    public AbstractBrickProduct createBrick() {
        return new StandardBrick();
    }

    @Override
    public AbstractFloorProduct createFloor() {
        return new StandardFloor();
    }

    @Override
    public AbstractBackgroundProduct createBackground() {
        return new StandardBackground();
    }
    
}
