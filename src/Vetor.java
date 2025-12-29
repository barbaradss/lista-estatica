public class Vetor {
    public Integer[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new Integer[capacidade];
        this.tamanho = 0;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Vetor {\n");
        sb.append("\titems: [");
        for (int position = 0; position < tamanho; position++){
            sb.append(elementos[position]);
            if (position < tamanho - 1){
                sb.append(", ");
            }
        }
        sb.append("]\n");
        sb.append(String.format("\tcapacity: %d\n", elementos.length));
        sb.append(String.format("\tsize: %d\n", tamanho));
        sb.append("}");
        return sb.toString();
    }
}
