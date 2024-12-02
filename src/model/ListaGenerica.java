package model;

import java.util.Arrays;

public class ListaGenerica<T> {

    private T lista[];
    private int quantidade;

    public ListaGenerica(){
        lista = (T[]) new Object[5];
        quantidade = 0;
    }

    public T[] getLista(){
        return Arrays.copyOf(lista, quantidade);
    }

    public boolean adicionar(T nome){
        if(quantidade >= lista.length){
            aumentarArray();
        }
        lista[quantidade++] = nome;
        return true;
    }

    public int buscar(T nome){
        for(int i=0; i<quantidade; i++){
            if(lista[i].equals(nome)){
                return i;
            }
        }
        return -1;
    }

    public boolean remover(T nome){
        int posicao = buscar(nome);
        if(posicao == -1){
            return false;
        }
        for(int i = posicao; i<quantidade-1; i++){
            lista[i] = lista[i+1];
        }
        quantidade--;
        return true;
    }

    public int getQuantidade(){
        return quantidade;
    }

    private void aumentarArray() {
        lista = Arrays.copyOf(lista, quantidade+5);
    }

}
