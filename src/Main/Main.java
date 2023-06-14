package Main;

import ArquivoService.GerenciaArquivo;
import ImpressaoService.ImprimeTempo;
import NumeroService.NumerosRandomizados;
import TempoService.*;

import java.util.List;

import static ENUM.variaveisConstantes.*;
import static NumeroService.NumerosRandomizados.numerosRandomizados;

public class Main {
    public static void main(String[] args) {




        NumerosRandomizados numeroAleatorio = new NumerosRandomizados();
        numeroAleatorio.numerosRandomizados(TAMANHO.getValor(), PRIMEIRO.getValor(), ULTIMO.getValor());
        Integer[] lista = numeroAleatorio.getArrayNumeros();

//        NumerosRandomizados numeroCrescente = new NumerosRandomizados();
//        numeroCrescente.numerosCrescentes(TAMANHO.getValor(), PRIMEIRO.getValor());
//        Integer[] lista = numeroCrescente.getArrayNumeros();

//        NumerosRandomizados numeroDec = new NumerosRandomizados();
//        numeroDec.numerosDec(TAMANHO.getValor(), PRIMEIRO.getValor());
//        Integer[] lista = numeroDec.getArrayNumeros();



        for(int i = 0 ; i< lista.length; i++){
            System.out.println(lista[i]);
        }



        List<TempoOrdem> listaTemp = List.of(new TempoBubbleSort() , new TempoSelectionSort(),
                new TempoInsertionSort(),new TempoHeapSort(), new TempoMergeSort(), new TempoQuickSort());
        ImprimeTempo imprimeTempo = new ImprimeTempo(listaTemp);
        imprimeTempo.fazerBuscas(lista);

    }
}