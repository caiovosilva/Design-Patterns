/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import interfaces.IPrototype;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author caiov
 */
public class FlexiblePrototype {
    
    private FlexiblePrototype(){
        m_protoList = new HashMap<String, PrototypeWrapper>();
    }
    
    public static FlexiblePrototype getInstance(){
        if(instance==null)
            instance = new FlexiblePrototype();
        return instance;
    }
    
    public IPrototype create(String name){
        if(m_protoList.containsKey(name))          
            return m_protoList.get(name).getPrototype();
        return null;
    }
    
    public boolean addPrototype(String name, IPrototype proto, int minInstances, int maxInstances){
        if(m_protoList.get(name)==null){
            m_protoList.put(name, new PrototypeWrapper(proto, minInstances, maxInstances));
            return true;
        }
        return false;
    }
    
    public boolean removePrototype(String name){
        if(m_protoList.get(name)!=null){
            m_protoList.remove(name);
            return true;
        }
        return false;
    }
    
    //private Map<String,IPrototype> m_protoList;   
    private Map<String, PrototypeWrapper> m_protoList;       
    private static FlexiblePrototype instance;
}
