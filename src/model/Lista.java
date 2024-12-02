package model;

import java.util.Arrays;

public class Lista {

    private String lista[];
    private int quantidade;

    public Lista(){
        lista = new String[5];
        quantidade = 0;
    }

    public String[] getLista(){
        return Arrays.copyOf(lista, quantidade);
    }

    public boolean adicionar(String nome){
        if(quantidade >= lista.length){
            aumentarArray();
        }
        lista[quantidade++] = nome;
        return true;
    }

    private void aumentarArray() {
        lista = Arrays.copyOf(lista, quantidade+5);
    }


}
