package Simples;

public class SelectionSort {

    public static Integer [] agrupa(Integer[] lista) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (lista[j] < lista[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = lista[minIndex];
            lista[minIndex] = lista[i];
            lista[i] = temp;
        }
        return lista;
    }


}
