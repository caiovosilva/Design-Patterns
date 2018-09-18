package inf011.pkg20161.p2;

public class LogDecorator extends Decorator
{
    public LogDecorator() {
    }
    public LogDecorator(IComponent decorated) throws Exception {
        super(decorated);
    }
    public void aumentarPreco(double percentual) {
        super.aumentarPreco(percentual);
        System.out.println("Fazendo o log");
    }
}
