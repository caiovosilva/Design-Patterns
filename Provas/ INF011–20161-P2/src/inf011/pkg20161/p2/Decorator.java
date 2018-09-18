package inf011.pkg20161.p2;

public abstract class Decorator extends IComponent
{
    protected Decorator() {
        this.decorated = null;
    }
    protected Decorator(IComponent decorated) throws Exception {
        setDecorated(decorated);
    }
    public void setDecorated(IComponent decorated) throws Exception {
        if (decorated instanceof Composite)
            throw new Exception();
        this.decorated = decorated;    
    }
    public IComponent getDecorated() {
        return decorated;
    }
    public void aumentarPreco(double percentual) {
        decorated.aumentarPreco(percentual);
    }
    protected IComponent decorated;
}
