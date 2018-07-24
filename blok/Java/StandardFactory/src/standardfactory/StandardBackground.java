/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standardfactory;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import themeFactory.AbstractBackgroundProduct;

/**
 *
 * @author caiovosilva
 */
public class StandardBackground implements AbstractBackgroundProduct{

    @Override
    public Image getImagePath() {
        URL url = this.getClass().getResource("resources/background.png");
        System.out.println(url.toString());
        Image image = new ImageIcon(url).getImage();
        return image;
    }
    
    public static void main(String[] args) {
        new StandardBackground().getImagePath();
    }
    
}
