package Main;

import ImpressaoService.ImprimeTempo;
import NumeroService.GeradorDeNumeros;
import TempoService.*;

import java.util.List;

import static ENUM.variaveisConstantes.*;

public class Main {
    public static void main(String[] args) {


        GeradorDeNumeros numeroAleatorio = new GeradorDeNumeros();
        numeroAleatorio.numerosRandomizados(TAMANHO.getValor(), PRIMEIRO.getValor(), ULTIMO.getValor());
        Integer[] lista = numeroAleatorio.getArrayNumeros();

//        GeradorDeNumeros numeroCrescente = new GeradorDeNumeros();
//        numeroCrescente.numerosCrescentes(TAMANHO.getValor(), PRIMEIRO.getValor());
//        Integer[] lista = numeroCrescente.getArrayNumeros();

//        GeradorDeNumeros numeroDec = new GeradorDeNumeros();
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