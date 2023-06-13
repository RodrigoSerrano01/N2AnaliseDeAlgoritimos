package Simples;

public class InsertionSort {

    public static Integer[] agrupa(Integer[] lista) {
        int n = lista.length;
        for (int i = 1; i < n; i++) {
            int key = lista[i];
            int j = i - 1;
            while (j >= 0 && lista[j] > key) {
                lista[j + 1] = lista[j];
                j--;
            }
            lista[j + 1] = key;
        }
        return lista;
    }

}
