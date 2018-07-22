/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standardfactory;
import themeFactory.*;
/**
 *
 * @author caiovosilva
 */
public class StandardFactory implements AbstractThemeFactory{

    @Override
    public AbstractBrickProduct createBrickProduct() {
        return new StandardBrick();
    }

    @Override
    public AbstractFloorProduct createFloorProduct() {
        return new StandardFloor();
    }

    @Override
    public AbstractBackgroundProduct createBackgroundProduct() {
        return new StandardBackground();
    }
    
}
