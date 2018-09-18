package inf011.pkg20161.p2;

import java.util.ArrayList;

public class Composite extends IComponent
{
    public Composite() {
        children = new ArrayList<IComponent>();
    }
    public boolean addChild(IComponent child) throws Exception {
        if (child instanceof Decorator)
            throw new Exception();
        children.add(child);
        return true;
    }
    public boolean removeChild(IComponent child) {
        children.remove(child);
        return true;
    }
    public static void setDecorator(Decorator newDecorator) {
        decorator = newDecorator;
    }
    public void aumentarPreco(double percentual) {
        for(IComponent child: children) {
            if (child instanceof Composite) {
                child.aumentarPreco(percentual);
            } else {
                IComponent target = child;
                if (decorator != null) {
                    target = decorator;
                    Decorator nextDecorator = decorator;
                    Decorator lastDecorator;
                    do {
                        lastDecorator = nextDecorator;
                        try { nextDecorator = (Decorator) lastDecorator.getDecorated(); }
                        catch (ClassCastException e) { nextDecorator = null; }
                    } while(nextDecorator != null);
                    try {
                        lastDecorator.setDecorated(child);
                    } catch (Exception e) {
                        System.out.println("Aconteceu uma exception");
                    }
                }
                target.aumentarPreco(percentual);
            }
        }
    }
    ArrayList<IComponent> children;
    protected static Decorator decorator = null;
}
