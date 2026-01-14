import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

//        vetor.adiciona(10);
//        vetor.adiciona(20);
//        vetor.adiciona(10);
//        vetor.adiciona(20);
//        vetor.adiciona(10);
//        System.out.println(vetor);
//
//
//        //Ordenadores
//
//        Vetor lista = new Vetor(10);
//        lista.adiciona(10);
//        lista.adiciona(30);
//        lista.adiciona(50);
//        lista.adiciona(60);
//        lista.adiciona(80);
//
//
//        Vetor.SortType algoritmo;
//        if (lista.tamanho() < 10) {
//            algoritmo = Vetor.SortType.INSERTION;
//        } else if (lista.tamanho() < 50) {
//            algoritmo = Vetor.SortType.SELECTION;
//        } else {
//            algoritmo = Vetor.SortType.BUBBLE;
//        }
//        System.out.println("Usando: " + algoritmo);
//        lista.sort(algoritmo);
//        System.out.println("Resultado: " + lista);


//        Integer[] listas = {25, 42,7 ,8,1, 15,2,9,73, 89, 12, 3};
//        System.out.println("Antes: " + Arrays.toString(listas) );
//
//        BubbleSort.sort(listas, listas.length);
//        //InsertionSort.sort(listas, listas.length);
//        //SelectionSort.sort(listas, listas.length);
//
//        System.out.println("Depois: " + Arrays.toString(listas));

        Random random = new Random();
        SortedArrayList lista = new SortedArrayList(512);
        for (int i = 0; i < 512; i++) {
            int item = random.nextInt(1, 1000);
            lista.addItem(item);

        }
        System.out.println(lista);

        //e quando aparecer duas vezes?
        int index = lista.pesquisaBinaria(45);
        System.out.println(index);
    }
}