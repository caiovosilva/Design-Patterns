/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author caiovosilva
 */
public abstract class PizzaDecorator implements IComponent{

    @Override
    public String decorar() {
        return decorated.decorar() + " + " + adicinarIngrediente();
    }
    
    protected abstract String adicinarIngrediente();
    
    public void setDecorated(IComponent decorated) {
        this.decorated = decorated;
    }
    
    private IComponent decorated;
    protected String ingrediente;
}
