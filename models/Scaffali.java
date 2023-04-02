package esercizioGestionaleBiblioteca.models;

import java.util.TreeMap;

public class Scaffali {
    private static TreeMap<String, Libri> scaffale = new TreeMap<>();

    public Scaffali() {
    }

    public static TreeMap<String, Libri> getScaffale() {
        return scaffale;
    }

    public static void setScaffale(TreeMap<String, Libri> scaffale) {
        Scaffali.scaffale = scaffale;
    }


}
