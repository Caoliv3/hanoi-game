package br.com.std.hanoi;

import org.junit.Test;
import static org.junit.Assert.*;



public class TestePilha {

    @Test
    public void testaEmpilhaDesempilha(){


        int[] testPilha = new int[3];
        int[] testResult = {3,2,1};
        Pilha pilha1 = new Pilha(3);

        for(int i = 1; i < 4; i++) {
            pilha1.empilhar(i);
        }

        for(int i = 1; i < 4; i++) {
            int ultimaPosicao = pilha1.desempilha();
            testPilha[i -1] = ultimaPosicao;
        }

        assertArrayEquals(testResult,testPilha);

    }

    @Test
    public void testGetTopo(){

        Pilha pilha1 = new Pilha(3);
        pilha1.empilhar(3);
        pilha1.empilhar(2);
        pilha1.empilhar(1);

        assertEquals(1,pilha1.getTopo());

        pilha1.desempilha();
        pilha1.desempilha();
        pilha1.desempilha();
        pilha1.desempilha();
        assertEquals(-1,pilha1.getTopo());


    }


    @Test
    public void testDesempilhaVazio(){

        Pilha pilha1 = new Pilha(3);

        assertEquals(-1,pilha1.desempilha());


    }
}
