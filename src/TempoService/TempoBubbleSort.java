package TempoService;

import Simples.BubbleSort;

public class TempoBubbleSort implements TempoOrdem {


    private double tempo;
    @Override
    public double tempoOrdem(Integer[] lista) {
       // double start =  System.nanoTime();
        double timeBeginning = System.currentTimeMillis();
        BubbleSort.agrupa(lista);
        //double end =  System.nanoTime();
        double timeEnding = System.currentTimeMillis();
       // this.tempo = ((end - start)/ 1000000);
        this.tempo = (timeEnding-timeBeginning )/1000;
        System.out.println(toString());
        return tempo;
    }
    @Override
    public String toString(){
        return String.format("Tempo de ordenação BubbleSort: %.6f s", this.tempo);

    }

}
