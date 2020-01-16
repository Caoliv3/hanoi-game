package br.com.std.hanoi;

import java.util.List;

public class Game {

    public static void main (String[] args){

        Pilha pilha1 = new Pilha(3);

        for(int i = 1; i < 4; i++) {
            pilha1.empilhar(i);
        }

        for(int i = 1; i < 4; i++) {
            int ultimaPosicao = pilha1.desempilha();
            System.out.println(ultimaPosicao);
        }

    }
}
