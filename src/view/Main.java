package view;

import model.Lista;
import model.ListaGenerica;
import model.Pessoa;

public class Main {
    public static void main(String[] args) {
        ListaGenerica<String> listaString = new ListaGenerica<>();
        listaString.adicionar("João");

        ListaGenerica<Pessoa> listaPessoas = new ListaGenerica<>();
        listaPessoas.adicionar(new Pessoa("Maria"));

    }
}