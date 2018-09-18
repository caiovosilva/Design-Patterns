package inf011.pkg20161.p2;

public class TwitterDecorator extends Decorator
{
    public TwitterDecorator() {
    }
    public TwitterDecorator(IComponent decorated) throws Exception {
        super(decorated);
    }
    public void aumentarPreco(double percentual) {
        System.out.println("Enviando mensagem via twitter");
        super.aumentarPreco(percentual);
    }
}
