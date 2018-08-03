/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypeexample;

import interfaces.IPrototype;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author caiov
 */
public class FlexiblePrototype {
    
    public FlexiblePrototype(){
        m_protoList = new HashMap<String, IPrototype>();
    }
    
    public IPrototype create(String name){
        if(m_protoList.containsKey(name))
            return m_protoList.get(name).clone();
        return null;
    }
    
    public boolean addPrototype(String name, IPrototype proto){
        if(m_protoList.get(name)==null){
            m_protoList.put(name, proto);
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
    
    private Map<String,IPrototype> m_protoList;       
}
