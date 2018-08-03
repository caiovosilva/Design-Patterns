/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypeexample;

import interfaces.IPrototype;

/**
 *
 * @author caiov
 */
public class Pneu implements IPrototype{

    @Override
    public IPrototype clone() {
        return new Pneu(m_aro, m_tipo);
    }
    
    public Pneu(double aro, String tipo){
        this.m_aro = aro;
        this.m_tipo = tipo;
    }
    
    @Override
    public String toString(){
        return "eu sou um pneu!!";
    }
    private double m_aro;
    private String m_tipo;
}
