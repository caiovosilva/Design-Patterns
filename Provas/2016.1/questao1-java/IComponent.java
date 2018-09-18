public abstract class IComponent
{
    public abstract void aumentarPreco(double percentual);
    public boolean addChild(IComponent child) throws Exception {
        throw new Exception();
    }
    public boolean removeChild(IComponent child) throws Exception {
        throw new Exception();
    }
}
