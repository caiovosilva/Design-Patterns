/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Rectangle;

/**
 *
 * @author caiovosilva
 */
public interface IGameBody {
    public Rectangle getRectangle();
    
    public enum Type {
        PLAYER,
        BLOCK,
        GROUND
    }
    
    public Type getType();

    public void setType(Type m_type);
}