public class InsertionSort {
    public static void sort(Integer[] array, int size){
        for (int i = 1; i < size; i++){
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
