package view;

import model.Lista;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println(Arrays.toString(lista.getLista()));
        lista.adicionar("João");
        lista.adicionar("Maria");
        lista.adicionar("Pedro");
        lista.adicionar("Ana");
        lista.adicionar("José");
        lista.adicionar("Matheus");
        System.out.println(Arrays.toString(lista.getLista()));

    }
}