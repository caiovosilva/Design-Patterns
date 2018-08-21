/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import interfaces.IPrototype;

/**
 *
 * @author caiov
 */
public class Chassi implements IPrototype{
    
    @Override
    public IPrototype clone() {
        return new Chassi(m_largura, m_tipo);
    }
    
    public Chassi(double largura, String tipo){
        this.m_largura = largura;
        this.m_tipo = tipo;
    }
    
    @Override
    public String toString(){
        return "eu sou um chassi!";
    }
    private double m_largura;
    private String m_tipo;
}
