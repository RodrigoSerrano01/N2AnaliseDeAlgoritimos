package TempoService;

import Simples.BubbleSort;
import Simples.InsertionSort;

public class TempoInsertionSort implements TempoOrdem{

    private double tempo;
    @Override
    public double tempoOrdem(Integer[] lista) {
        double timeBeginning = System.currentTimeMillis();
        InsertionSort.agrupa(lista);
        double timeEnding = System.currentTimeMillis();
        this.tempo = (timeEnding-timeBeginning )/1000;
        System.out.println(toString());
        return tempo;
    }
    @Override
    public String toString(){
        return String.format("Tempo de ordenação InsertionSort: %.6f s", this.tempo);

    }
}
