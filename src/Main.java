//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adiciona(10);
        vetor.adiciona(20);
        System.out.println(vetor);

        //System.out.println("Tamanho atual: " +vetor.tamanho());
        //System.out.println("Item na posição 0: " + vetor.busca(0));
        //System.out.println("Posição do Elemento 20:" + vetor.busca(20));

        vetor.remove(0);
        System.out.println(vetor);

    }
}