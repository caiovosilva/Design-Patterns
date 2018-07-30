/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icefactory;

import java.awt.Image;
import javax.swing.ImageIcon;
import interfaces.AbstractBackgroundProduct;

/**
 *
 * @author caiov
 */
public class IceBackground implements AbstractBackgroundProduct{
   
    @Override
    public Image getImage() {
        return new ImageIcon(getClass().getResource("/iceImages/background.png")).getImage();
    }  
}
