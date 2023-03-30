package Biblioteca.models;

import java.util.TreeMap;

public class Generi {
    private final String GIALLO = "Giallo";
    private final String ROSA = "Rosa";
    private final String HORROR = "Horror";
    private final String FANTASY = "Fantasy";
    private final String FANTASCIENZA = "Fantascienza";
    private final String EROTICO = "Erotico";
    private final String STORICO = "Storico";
    private final String UMORISTICO = "Umoristico";
    private final String AVVENTURA = "Avventura";
    private final String BIOGRAFIA = "Biografia";
    private final String FANFICTION = "Fanfiction";
    private final String THRILLER = "Thriller";
    private final String SAGGISTICA = "Saggistica";
    private final String YOUNG_ADULT = "Young Adult";
    private static TreeMap<String, Boolean> generiList = new TreeMap<>();

    public Generi(){
        formaLista();
    }
    private TreeMap<String, Boolean> formaLista() {
        generiList.put(GIALLO, false);
        generiList.put(ROSA, true);
        generiList.put(HORROR, false);
        generiList.put(FANTASY, true);
        generiList.put(FANTASCIENZA, true);
        generiList.put(EROTICO, false);
        generiList.put(STORICO, true);
        generiList.put(UMORISTICO, true);
        generiList.put(AVVENTURA, true);
        generiList.put(BIOGRAFIA, true);
        generiList.put(FANFICTION, true);
        generiList.put(THRILLER, true);
        generiList.put(SAGGISTICA, true);
        generiList.put(YOUNG_ADULT, true);
        return generiList;
    }

    public static TreeMap<String, Boolean> getGeneriList() {
        return generiList;
    }
}
