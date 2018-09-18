import java.util.ArrayList;

public class Composite extends IComponent
{
    public Composite() {
        children = new ArrayList<IComponent>();
    }
    public boolean addChild(IComponent child) {
        children.add(child);
        return true;
    }
    public boolean removeChild(IComponent child) {
        children.remove(child);
        return true;
    }
    public void aumentarPreco(double percentual) {
        for(IComponent child: children)
            child.aumentarPreco(percentual);
    }
    ArrayList<IComponent> children;
}
