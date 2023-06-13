package Main;

import ArquivoService.GerenciaArquivo;
import ImpressaoService.ImprimeTempo;
import NumeroService.NumerosRandomizados;
import TempoService.*;

import java.util.List;

import static ENUM.variaveisConstantes.*;

public class Main {
    public static void main(String[] args) {


        NumerosRandomizados n = new NumerosRandomizados(TAMANHO.getValor(), PRIMEIRO.getValor(), ULTIMO.getValor());

        Integer[] lista = n.getArrayNumeros();

       //GerenciaArquivo.salvaArquivo(n,TAMANHO.getValor());


        List<TempoOrdem> listaTemp = List.of(new TempoBubbleSort() , new TempoSelectionSort(),
                new TempoInsertionSort(),new TempoHeapSort(), new TempoMergeSort(), new TempoQuickSort());
        ImprimeTempo imprimeTempo = new ImprimeTempo(listaTemp);
        imprimeTempo.fazerBuscas(lista);

    }
}