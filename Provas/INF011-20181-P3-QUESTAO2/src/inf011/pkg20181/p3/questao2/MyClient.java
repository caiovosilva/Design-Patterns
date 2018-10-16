package inf011.pkg20181.p3.questao2;

import interfaces.ISortStrategy;

/**
 *
 * @author caiovosilva
 */

public class MyClient {
    
    private ISortStrategy sortStrategy;

    public void setSortStrategy(ISortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
    
    public void sort(){
        sortStrategy.sort();
    }
}
