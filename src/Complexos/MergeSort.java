package Complexos;

import java.util.Arrays;

public class MergeSort {


    public static Integer[] agrupa(Integer[] lista) {
        if (lista.length <= 1) {
            return lista;
        }
        int mid = lista.length / 2;
        Integer[] leftHalf = Arrays.copyOfRange(lista, 0, mid);
        Integer[] rightHalf = Arrays.copyOfRange(lista, mid, lista.length);
        agrupa(leftHalf);
        agrupa(rightHalf);
        merge(lista, leftHalf, rightHalf);
        return lista;
    }

    private static void merge(Integer[] lista, Integer[] leftHalf, Integer[] rightHalf) {
        int i = 0, j = 0, k = 0;
        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j]) {
                lista[k++] = leftHalf[i++];
            } else {
                lista[k++] = rightHalf[j++];
            }
        }
        while (i < leftHalf.length) {
            lista[k++] = leftHalf[i++];
        }
        while (j < rightHalf.length) {
            lista[k++] = rightHalf[j++];
        }
    }

}
