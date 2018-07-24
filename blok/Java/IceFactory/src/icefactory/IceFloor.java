/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icefactory;

import java.awt.Image;
import javax.swing.ImageIcon;
import themeFactory.AbstractFloorProduct;

/**
 *
 * @author caiov
 */
public class IceFloor implements AbstractFloorProduct {

    @Override
    public Image getImage() {
        return new ImageIcon(getClass().getResource("/ground.png")).getImage();
    }
}
