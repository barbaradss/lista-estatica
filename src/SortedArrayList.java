import java.util.ArrayList;
import java.util.Arrays;

public class SortedArrayList {
    private final Integer[] array;
    private int size;

    public SortedArrayList(int capacity) {
        array = new Integer[capacity];
        size = 0;
    }

    public void addItem(int item) {
        int i = size - 1;

        while (i >= 0 && array[i] > item) {
            array[i + 1] = array[i];
            i--;
        }
        array[i + 1] = item;
        size++;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }

    public int pesquisaBinaria(int alvo){
        int min = 0;
        int max = size -1;

        while(min <= max){
            int media = (min + max) / 2;

            if (array[media] == alvo) {
                return media;
            } else if (array[media] < alvo) {
                min = media + 1;
            } else {
                max = media - 1;
            }
        }
        return -1;
    }
}

