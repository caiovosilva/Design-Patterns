public class TwitterDecorator extends Decorator
{
    public TwitterDecorator(IComponent decorated) {
        super(decorated);
    }
    public void aumentarPreco(double percentual) {
        System.out.println("Enviando mensagem via twitter");
        super.aumentarPreco(percentual);
    }
}
