import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Ordenadores

        Vetor lista = new Vetor(10);
        lista.adiciona(10);
        lista.adiciona(30);
        lista.adiciona(50);
        lista.adiciona(60);
        lista.adiciona(80);


        Vetor.SortType algoritmo;
        if (lista.tamanho() < 10) {
            algoritmo = Vetor.SortType.INSERTION;
        } else if (lista.tamanho() < 50) {
            algoritmo = Vetor.SortType.SELECTION;
        } else {
            algoritmo = Vetor.SortType.BUBBLE;
        }
        System.out.println("Usando: " + algoritmo);
        lista.sort(algoritmo);
        System.out.println("Resultado: " + lista);



        //Sorted Array e Pesquisa Binária
        Random random = new Random();
        SortedArrayList lista2 = new SortedArrayList(512);
        for (int i = 0; i < 512; i++) {
            int item = random.nextInt(1, 1000);
            lista2.addItem(item);

        }
        System.out.println(lista2);

        int index = lista2.pesquisaBinaria(45);
        System.out.println(index);

    }
}