/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standardfactory;

import java.net.URL;
import themeFactory.AbstractBrickProduct;

/**
 *
 * @author caiovosilva
 */
public class StandardBrick implements AbstractBrickProduct {

    @Override
    public URL getImageURL() {
        return getClass().getResource("/images/tree.png");
    }
    
}
