package app;

import interfaces.ISerializer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author caiovosilva
 */
public class MyFramework {
    
    public void serialize(){
        serializer.serialize();
    }
    
    public void setCreator(ISerializer serializer){
        this.serializer = serializer;
    }
    
    private ISerializer serializer;
}
