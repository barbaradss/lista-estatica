public class Vetor {
    public Integer[] elementos;
    private int tamanho;

    public enum SortType{
        BUBBLE,
        INSERTION,
        SELECTION
    }

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

    public boolean adiciona(int posicao, Integer elemento){
        verificaAtualizacao(posicao, tamanho + 1);
        for (int i = this.tamanho -1; i>=posicao; i--){
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao]=elemento;
        this.tamanho++;

        return true;
    }

    public void verificaAtualizacao (int posicao, int limiteSuperior){
        if (posicao < 0 || posicao >= limiteSuperior){
            throw new IllegalArgumentException("Posição inválida");
        }
    }

    public int tamanho(){
        return this.tamanho;
    }

    public Integer busca(int posicao){
        verificaAtualizacao(posicao, tamanho);
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

    //Complexidade Linear
    public void remove (int posicao){
        verificaAtualizacao(posicao, tamanho);
        for (int i = posicao; i < this.tamanho -1; i++){
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    //Complexidade constante
    public void removeElemento(int posicao) {
        verificaAtualizacao(posicao, tamanho);
        this.tamanho--;
        this.elementos[posicao] = this.elementos[tamanho];
        this.elementos[tamanho] = null;
    }

    public void atualiza(int posicao, Integer elemento) {
        verificaAtualizacao(posicao, tamanho);
        this.elementos[posicao] = elemento;
    }

    public void sort(SortType sortType){
        switch (sortType){
            case BUBBLE:
                BubbleSort.sort(elementos, tamanho);
                break;
            case INSERTION:
                InsertionSort.sort(elementos, tamanho);
                break;
            case SELECTION:
                SelectionSort.sort(elementos, tamanho);
                break;
            default:
                throw new IllegalArgumentException("Tipo de ordenação inválido!");
        }
    }
}
