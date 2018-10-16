package inf011.pkg20181.p3.questao2;

/**
 *
 * @author caiovosilva
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClient cliente = new MyClient();
        cliente.setSortStrategy(new QuickSort());
        cliente.sort();
        cliente.setSortStrategy(new MergeSort());
        cliente.sort();
    }
    
}
