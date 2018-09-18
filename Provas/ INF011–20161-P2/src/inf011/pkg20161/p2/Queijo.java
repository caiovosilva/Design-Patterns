package inf011.pkg20161.p2;

public class Queijo extends IComponent
{
    public Queijo(double preco) {
        this.preco = preco;
    }
    public void aumentarPreco(double percentual) {
        preco += preco*percentual;
        System.out.println("Aumentando o preco do queijo para " + preco);
    }
    private double preco;
}
