/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standardfactory;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import interfaces.AbstractBrickProduct;

/**
 *
 * @author caiovosilva
 */
public class StandardBrick implements AbstractBrickProduct {

    @Override
    public BufferedImage getImage() {
        Image im = new ImageIcon(getClass().getResource("/standardImages/brick.png")).getImage();
        BufferedImage bi = new BufferedImage
        (im.getWidth(null),im.getHeight(null),BufferedImage.TYPE_INT_RGB);
        Graphics bg = bi.getGraphics();
        bg.drawImage(im, 0, 0, null);
        bg.dispose();
        return bi;
    }    
}
