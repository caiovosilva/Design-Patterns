/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import interfaces.IPrototype;

/**
 *
 * @author caiovosilva
 */
public class PrototypeWrapper {

    public PrototypeWrapper(IPrototype prototype, int minIntances, int maxInstances) {
        index = 0;
        proto = prototype;
        protoArray = new IPrototype[maxInstances];
        for(int i=0; i < minInstances; i++)
            protoArray[i] = prototype.clone();      
    }

    
    public IPrototype getPrototype(){
        if(index>=protoArray.length)
            index=0;
        if(protoArray[index]==null)
            protoArray[index] = proto.clone();
        
        index++;
        return protoArray[index-1];
    }
    private int minInstances;
    private int maxInstances;
    private int index;
    private IPrototype proto;
    private IPrototype[] protoArray;
}
