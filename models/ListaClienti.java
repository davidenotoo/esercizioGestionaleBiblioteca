package esercizioGestionaleBiblioteca.models;

import java.util.ArrayList;
import java.util.List;

public class ListaClienti {
    private static List<Cliente> listaClienti = new ArrayList<>();

    public ListaClienti() {

    }
    public static List<Cliente> aggiungiCliente(Cliente cliente){
        listaClienti.add(cliente);
        return listaClienti;
    }

    public static List<Cliente> getListaClienti() {
        return listaClienti;
    }

    public static void setListaClienti(List<Cliente> listaClienti) {
        ListaClienti.listaClienti = listaClienti;
    }

    @Override
    public String toString() {
        return listaClienti + "";
    }
}
