package TempoService;

import Complexos.HeapSort;
import Simples.BubbleSort;

public class TempoHeapSort implements TempoOrdem{
    private double tempo;
    @Override
    public double tempoOrdem(Integer[] lista) {
        double timeBeginning = System.currentTimeMillis();
        HeapSort.agrupa(lista);
        double timeEnding = System.currentTimeMillis();
        this.tempo = (timeEnding-timeBeginning )/1000;
        System.out.println(toString());
        return tempo;
    }
    @Override
    public String toString(){
        return String.format("Tempo de ordenação HeapSort: %.6f s", this.tempo);

    }
}
