package TempoService;

import Complexos.MergeSort;
import Simples.BubbleSort;

public class TempoMergeSort implements TempoOrdem{
    private double tempo;
    @Override
    public double tempoOrdem(Integer[] lista) {
        double timeBeginning = System.currentTimeMillis();
        MergeSort.agrupa(lista);
        double timeEnding = System.currentTimeMillis();
        this.tempo = (timeEnding-timeBeginning )/1000;
        System.out.println(toString());
        return tempo;
    }
    @Override
    public String toString(){
        return String.format("Tempo de ordenação MergeSort: %.6f s", this.tempo);

    }
}
