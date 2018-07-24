/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standardfactory;

import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import themeFactory.AbstractBackgroundProduct;

/**
 *
 * @author caiovosilva
 */
public class StandardBackground implements AbstractBackgroundProduct{

    @Override
    public Image getImage() {
        return new ImageIcon(getClass().getResource("/background.png")).getImage();
    }  
}
