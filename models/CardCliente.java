package Biblioteca.models;

import java.util.TreeMap;

public class CardCliente {

    private Cliente cliente;
    private GeneratoreDiCodici codiceUnivoco;

    private static TreeMap<Cliente, String> adderListAndCard(Cliente cliente) {
        String codice = GeneratoreDiCodici.generate();

        return null;
    }

}
