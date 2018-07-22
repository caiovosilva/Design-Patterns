/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import themeFactory.AbstractBackgroundProduct;
import themeFactory.AbstractBrickProduct;
import themeFactory.AbstractFloorProduct;

/**
 *
 * @author caiovosilva
 */
public interface IPluginController {
    public void loadTheme(String factoryName);
    public AbstractFloorProduct getCurrentFloorProduct();
    public AbstractBrickProduct getCurrentBrickProduct();
    public AbstractBackgroundProduct getCurrentBackgroundProduct();
}
