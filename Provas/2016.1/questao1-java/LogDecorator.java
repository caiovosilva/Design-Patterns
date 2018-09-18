public class LogDecorator extends Decorator
{
    public LogDecorator(IComponent decorated) {
        super(decorated);
    }
    public void aumentarPreco(double percentual) {
        super.aumentarPreco(percentual);
        System.out.println("Fazendo o log");
    }
}
