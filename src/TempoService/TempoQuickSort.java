package TempoService;

import Complexos.QuickSort;
import Simples.BubbleSort;

public class TempoQuickSort implements TempoOrdem{
    private double tempo;
    @Override
    public double tempoOrdem(Integer[] lista) {
        double timeBeginning = System.currentTimeMillis();
        QuickSort.agrupa(lista);
        double timeEnding = System.currentTimeMillis();
        this.tempo = (timeEnding-timeBeginning )/1000;
        System.out.println(toString());
        return tempo;
    }
    @Override
    public String toString(){
        return String.format("Tempo de ordenação QuickSort: %.6f s", this.tempo);

    }
}
