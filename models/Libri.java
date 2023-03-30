package Biblioteca.models;

import java.util.TreeMap;

public class Libri {
    private String titoloLibro;
    private String autoreLibro;
    private TreeMap<String, Boolean> generi = Generi.getGeneriList();
    private LibriDB disponibilita;

}
