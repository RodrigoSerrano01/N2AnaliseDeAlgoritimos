package Complexos;

public class HeapSort {

    public static Integer[] agrupa(Integer[] lista) {
        int n = lista.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(lista, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = lista[0];
            lista[0] = lista[i];
            lista[i] = temp;
            heapify(lista, i, 0);
        }
        return lista;
    }

    private static void heapify(Integer[] lista, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && lista[left] > lista[largest]) {
            largest = left;
        }
        if (right < n && lista[right] > lista[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = lista[i];
            lista[i] = lista[largest];
            lista[largest] = temp;
            heapify(lista, n, largest);
        }
    }

}
