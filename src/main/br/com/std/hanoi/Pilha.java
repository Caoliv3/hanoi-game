package br.com.std.hanoi;

public class Pilha{

    // armarzenar primeira posição do topo da pilha
    // representar a pilha com vetor

    private int posTopo;
    private int[] pilha;

    public Pilha (int tamanhoPilha) {
        this.pilha = new int[tamanhoPilha];
        this.posTopo = -1;
    }

    public boolean empilhar(int numero){

        this.posTopo++;
        this.pilha[posTopo] = numero;
        return true;
    }

    public int desempilha(){

        int aux = this.pilha[posTopo];
        this.pilha[posTopo] = 0;
        this.posTopo--;
        return aux;
    }

    /**
     *
     * @return valor ou -1 qdo estiver vazio
     */
    public int getTopo() {

        if (posTopo != -1)
            return pilha[posTopo];
        else
            return -1;
    }

    public int[] getPilha() {
        return pilha;
    }

    public boolean isVazia (){
        return posTopo == -1;
    }
}


