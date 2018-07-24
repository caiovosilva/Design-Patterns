/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standardfactory;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.ImageIcon;
import themeFactory.AbstractFloorProduct;

/**
 *
 * @author caiovosilva
 */
public class StandardFloor implements AbstractFloorProduct {

    @Override
    public Image getImagePath() {
        URL url = getClass().getResource("/images/ground.png");
        Image image = new ImageIcon(url).getImage();
        return image;
    }
    
}
