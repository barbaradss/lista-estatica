public class Vetor {
    public Integer[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new Integer[capacidade];
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vetor {\n");
        sb.append("\titems: [");
        for (int position = 0; position < tamanho; position++) {
            sb.append(elementos[position]);
            if (position < tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append("]\n");
        sb.append(String.format("\tcapacity: %d\n", elementos.length));
        sb.append(String.format("\tsize: %d\n", tamanho));
        sb.append("}");
        return sb.toString();
    }
    public boolean adiciona(Integer elemento){
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    public int tamanho(){
        return this.tamanho;
    }

    public Integer busca(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida. ");
        }
        return this.elementos[posicao];
    }

    public int busca(Integer elemento){
        for (int i = 0; i < this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public void remove (int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho -1; i++){
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }
    public boolean adiciona(int posicao, Integer elemento){
        if (posicao < 0 || posicao >= tamanho){
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = this.tamanho -1; i>=posicao; i--){
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao]=elemento;
        this.tamanho++;

        return true;
    }
}
