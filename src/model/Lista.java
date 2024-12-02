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

    public int buscar(String nome){
        for(int i=0; i<quantidade; i++){
            if(lista[i].equals(nome)){
                return i;
            }
        }
        return -1;
    }

    public boolean remover(String nome){

    }

    private void aumentarArray() {
        lista = Arrays.copyOf(lista, quantidade+5);
    }

}
