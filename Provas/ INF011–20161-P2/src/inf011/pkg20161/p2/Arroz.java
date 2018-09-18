package inf011.pkg20161.p2;

public class Arroz extends IComponent
{
    public Arroz(double preco) {
        this.preco = preco;
    }
    public void aumentarPreco(double percentual) {
        preco += preco*percentual;
        System.out.println("Aumentando o preco do arroz para " + preco);
    }
    private double preco;
}
