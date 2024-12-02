package model;

import java.util.Arrays;

public class ListaPessoa {
    private Pessoa lista[];
    private int quantidade;

    public ListaPessoa(){
        lista = new Pessoa[5];
        quantidade = 0;
    }

    public Pessoa[] getLista(){
        return Arrays.copyOf(lista, quantidade);
    }

    public boolean adicionar(Pessoa nome){
        if(quantidade >= lista.length){
            aumentarArray();
        }
        lista[quantidade++] = nome;
        return true;
    }

    public int buscar(Pessoa nome){
        for(int i=0; i<quantidade; i++){
            if(lista[i].equals(nome)){
                return i;
            }
        }
        return -1;
    }

    public boolean remover(Pessoa nome){
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