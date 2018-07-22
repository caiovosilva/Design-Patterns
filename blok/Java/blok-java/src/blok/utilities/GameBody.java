/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.utilities;

import java.awt.Rectangle;

/**
 *
 * @author caiovosilva
 */
public class GameBody {

    public GameBody(Rectangle rec, Type type){
        m_rectangle = rec;
        m_type = type;
    }

    public Rectangle getRectangle() {
        return m_rectangle;
    }
    
    public enum Type {
        PLAYER,
        BLOCK,
        GROUND
    }
    
    public Type getType() {
        return m_type;
    }

    public void setType(Type m_type) {
        this.m_type = m_type;
    }
    private Rectangle m_rectangle;
    private Type m_type;

    
}
