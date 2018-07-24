/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standardfactory;

import java.awt.Image;
import javax.swing.ImageIcon;
import themeFactory.AbstractFloorProduct;

/**
 *
 * @author caiovosilva
 */
public class StandardFloor implements AbstractFloorProduct {

    @Override
    public Image getImage() {
        return new ImageIcon(getClass().getResource("/ground.png")).getImage();
    }
}
