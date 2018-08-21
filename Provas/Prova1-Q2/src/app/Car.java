/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.Serializable;

/**
 *
 * @author caiovosilva
 */
public class Car implements Serializable{
    
    public Car(String name){
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }
    private String name;
}
