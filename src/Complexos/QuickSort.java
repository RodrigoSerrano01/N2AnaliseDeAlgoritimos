package Complexos;

public class QuickSort {



//    private static int partition(Integer[] lista, int low, int high) {
//        int pivot = lista[low];
//        int i = low;
//        for (int j = low; j <= high - 1; j++) {
//            if (lista[j] <= pivot) {
//                i++;
//                int temp = lista[i];
//                lista[i] = lista[j];
//                lista[j] = temp;
//            }
//        }
//        int temp = lista[i + 1];
//        lista[i + 1] = lista[high];
//        lista[high] = temp;
//        return i + 1;
//    }

//    private static int separate(Integer[] elementsList, int beginning, int ending) {
//        int pivot = elementsList[beginning];
//        int i = beginning + 1, f = ending;
//        while (i <= f) {
//            if (elementsList[i] <= pivot)
//                i++;
//            else if (pivot < elementsList[f])
//                f--;
//            else {
//                int replacement = elementsList[i];
//                elementsList[i]=  elementsList[f];
//                elementsList[f] = replacement;
//                i++;
//                f--;
//            }
//        }
//        elementsList[beginning] = elementsList[f];
//        elementsList[f]= pivot;
//        return f;
//    }



//    public static void agrupa(Integer[] lista) {
//        quickSortHelper(lista, 0, lista.length - 1);
//    }
//
//    private static void quickSortHelper(Integer[] lista, int low, int high) {
//        if (low < high) {
//            int pivotIndex = separate(lista, low, high);
//            quickSortHelper(lista, low, pivotIndex - 1);
//            quickSortHelper(lista, pivotIndex + 1, high);
//        }
//    }
//
//
//    private static int separate(Integer[] elementsList, int beginning, int ending) {
//        int pivot = elementsList[beginning];
//        int i = beginning + 1, f = ending;
//        while (i <= f) {
//            while (i <= f && elementsList[i] <= pivot)
//                i++;
//            while (i <= f && pivot < elementsList[f])
//                f--;
//            if (i < f) {
//                int replacement = elementsList[i];
//                elementsList[i] = elementsList[f];
//                elementsList[f] = replacement;
//                i++;
//                f--;
//            }
//        }
//        elementsList[beginning] = elementsList[f];
//        elementsList[f] = pivot;
//        return f;
//    }


    public static void agrupa(Integer[] lista) {
        quickSortHelper(lista, 0, lista.length - 1);
    }

    private static void quickSortHelper(Integer[] lista, int low, int high) {
        if (low < high) {
            int pivotIndex = separate(lista, low, high);
            quickSortHelper(lista, low, pivotIndex - 1);
            quickSortHelper(lista, pivotIndex + 1, high);
        }
    }

    private static int separate(Integer[] elementsList, int beginning, int ending) {
        int mid = (beginning + ending) / 2;
        int pivot = elementsList[mid];
        int i = beginning, j = ending;

        while (i <= j) {
            while (elementsList[i] < pivot)
                i++;
            while (elementsList[j] > pivot)
                j--;

            if (i <= j) {
                int temp = elementsList[i];
                elementsList[i] = elementsList[j];
                elementsList[j] = temp;
                i++;
                j--;
            }
        }

        return i;
    }

}



