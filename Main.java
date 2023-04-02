package esercizioGestionaleBiblioteca;

import esercizioGestionaleBiblioteca.models.Cliente;
import esercizioGestionaleBiblioteca.models.GeneratoreDiCodici;
import esercizioGestionaleBiblioteca.models.ListaClienti;
import esercizioGestionaleBiblioteca.models.Scaffali;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<Cliente> listaCard = new ArrayList<>();
        Biblioteca.biblioTOT();
//        bibliotecaEXE();
        System.out.println(Scaffali.getScaffale());
    }

    public static void bibliotecaEXE() {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\n\nBenvenuto, hai già una Tessera Clienti?");
            System.out.println("\n1.  Si");
            System.out.println("2.  No, voglio crearla");
            int scelta = input.nextInt();
            switch (scelta) {

                // caso in cui il cliente già possiede una card;
                case 1:
                    Cliente clienteLoggato = loginCliente(input);
                    System.out.println(clienteLoggato);
                    break;
                // caso in cui si deve generare una card
                case 2:
                    generaCard(input);

                    break;

                // codice segreto per vedere la lista
                case 5551985:
                    System.out.println(ListaClienti.getListaClienti());
            }
        }
    }

    /**
     * Metodo che genera una CARD al cliente
     * @param input
     * @return cliente
     * @Output "CARD"
     */
    public static Cliente generaCard(Scanner input) {
        // creazione di una card Cliente;
        Cliente cliente = new Cliente();
        input.nextLine();
        // nome
        System.out.println("Inserisci il tuo NOME");
        cliente.setNomeCliente(input.nextLine());
        // cognome
        System.out.println("Inserisci il tuo COGNOME");
        cliente.setCognomeCliente(input.nextLine());
        // età
        System.out.println("Inserisci la tua ETÀ");
        cliente.setEtaCliente(input.nextInt());

        // genera codice univoco
        String code = GeneratoreDiCodici.generate();
        cliente.setCodiceUnivoco(code);

        // aggiungo il cliente alla lista
        ListaClienti.aggiungiCliente(cliente);

        // Stampa della card
        System.out.println("CARD generata:\n" + cliente);

        return cliente;
    }

    /**
     * Metodo che cerca il codice della card nella lista dei clienti
     * @param input Scanner
     * @return cliente
     * @OutputTrue "Benvenuto cliente"
     * @OutputFalse "Codice non valido"
     */
    public static Cliente loginCliente(Scanner input) {
        // creo cliente X
        Cliente cliente = new Cliente();
        // input per inserire il codice della CARD
        System.out.println("Inserisci il CODICE della Card");
        // ciclo che itera all'interno della lista e va a cercare il cliente
        String codiceInserito = input.next();
        for (int i = 0; i < ListaClienti.getListaClienti().size(); i++) {
            if (codiceInserito.equals(cliente.getCodiceUnivoco())) {
                System.out.println("Benvenuto " + ListaClienti.getListaClienti());
                return cliente;
            }
        }
        // caso in cui si inserisce un codice non valido
        System.out.println("Codice inserito NON VALIDO, riprova");
        return null;
    }





}