/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box2dsimulatorfactory;

import concreteclasses.Plugin;
import interfaces.ISimulator;
import interfaces.ISimulatorFactoryMethod;

/**
 *
 * @author caiovosilva
 */
public class Box2dSimulatorFactory extends Plugin implements ISimulatorFactoryMethod{

    @Override
    public ISimulator createSimulator() {
        return new Box2dSimulator();
    }
    
}
