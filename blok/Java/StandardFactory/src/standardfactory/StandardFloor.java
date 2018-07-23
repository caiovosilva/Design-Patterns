/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standardfactory;

import java.net.URL;
import themeFactory.AbstractFloorProduct;

/**
 *
 * @author caiovosilva
 */
public class StandardFloor implements AbstractFloorProduct {

    @Override
    public String getImagePath() {
        return "images/ground.png";
    }
    
}
