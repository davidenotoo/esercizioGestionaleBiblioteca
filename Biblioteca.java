package esercizioGestionaleBiblioteca;

import esercizioGestionaleBiblioteca.models.Generi;
import esercizioGestionaleBiblioteca.models.Libri;
import esercizioGestionaleBiblioteca.models.Scaffali;

public class Biblioteca {

    public static void toAddBook(Libri libro) {
        Scaffali.getScaffale().put(libro.getGenere().toString(), libro);
    }

    public static void prestaLibro(Libri libri) {
        if (libri.getDisponibilita().getNumeroCopiePresenti() > 0) {
            libri.getDisponibilita().setNumeroCopiePresenti(-1);
            System.out.println("Grazie, hai appena ricevuto: " + libri.getTitoloLibro());
        } else if (libri.getDisponibilita().getNumeroCopiePresenti() == 0) {
            System.out.println("Non ci sono copie disponibili al momento.\nRipassa in seguito");
        }
    }

    public static void biblioTOT() {
        Generi giallo = new Generi();
        Generi rosa = new Generi();
        Generi horror = new Generi();
        Generi fantasy = new Generi();
        Generi fantascenza = new Generi();
        Generi erotico = new Generi();
        Generi storico = new Generi();
        Generi umoristico = new Generi();
        Generi avventura = new Generi();
        Generi biografia = new Generi();
        Generi fanfiction = new Generi();
        Generi triller = new Generi();
        Generi saggistica = new Generi();
        Generi youngAdult = new Generi();

        // Giallo:
        Libri ilNomeDellaRosa = new Libri("Il nome della rosa", "Umberto Eco", giallo);
        Libri dieciPiccoliIndiani = new Libri("Dieci piccoli indiani", "Agatha Christie", giallo);
        Libri ilSilenzioDegliInnocenti = new Libri("Il silenzio degli innocenti", "Thomas Harris", giallo);
        // Rosa:
        Libri orgoglioEPregiudizio = new Libri("Orgoglio e pregiudizio", "Jane Austen", rosa);
        Libri ioPrimaDiTe = new Libri("Io prima di te", "Jojo Moyes", rosa);
        Libri laRagazzaDiBube = new Libri("La ragazza di Bube", "Carlo Cassola", rosa);
        // Horror:
        Libri dracula = new Libri("Dracula", "Bram Stoker", horror);
        Libri shining = new Libri("Shining", "Stephen King", horror);
        Libri lEsorcista = new Libri("L’esorcista", "William Peter Blatty", horror);
        // Fantasy:
        Libri ilSignoreDegliAnelli = new Libri("Il signore degli anelli", "J.R.R.Tolkien", fantasy);
        Libri HP1 = new Libri("Harry Potter e la pietra filosofale", "J.K.Rowling", fantasy);
        Libri narnia = new Libri("Le cronache di Narnia.Il leone, la strega e l’armadio", "C.S.Lewis", fantasy);
        // Fantascienza:
        Libri uno984 = new Libri("1984", "George Orwell", fantascenza);
        Libri ilMondoNuovo = new Libri("Il mondo nuovo", "Aldous Huxley", fantascenza);
        Libri guidaGalattica = new Libri("Guida galattica per gli autostoppisti", "Douglas Adams", fantascenza);
        // Erotico:
        Libri lolita = new Libri("Lolita", "Vladimir Nabokov", erotico);
        Libri cinquantaSfumature = new Libri("Cinquanta sfumature di grigio", "E.L.James", erotico);
        Libri emmanuelle = new Libri("Emmanuelle", "Emmanuelle Arsan", erotico);
        // Storico:
        Libri iPilastriDellaTerra = new Libri("I pilastri della terra", "Ken Follett", storico);
        Libri ilMedicoDiSaragozza = new Libri("Il medico di Saragozza", "Noah Gordon", storico);
        Libri laCattedraleDelMare = new Libri("La cattedrale del mare", "Ildefonso Falcones", storico);
        // Umoristico:
        Libri ilBaroneRampante = new Libri("Il barone rampante", "Italo Calvino", umoristico);
        Libri treUomini = new Libri("Tre uomini in barca(per tacer del cane)", "Jerome K.Jerome", umoristico);
        Libri diarioSchiappa = new Libri("Diario di una schiappa.Portatemi a casa !", "Jeff Kinney", umoristico);
        // Avventura:
        Libri lIsolaDelTesoro = new Libri("L’isola del tesoro", "Robert Louis Stevenson", avventura);
        Libri montecristo = new Libri("Il conte di Montecristo", "Alexandre Dumas", avventura);
        Libri giro80giorni = new Libri("Il giro del mondo in 80giorni", "Jules Verne", avventura);
        // Biografia:
        Libri laVitaDavantiASe = new Libri("La vita davanti a sé", "Romain Gary", biografia);
        Libri ioTina = new Libri("Io, Tina", "Tina Turner", biografia);
        Libri stradaLibertà = new Libri("La lunga strada verso la libertà", "Nelson Mandela", biografia);
        // Fanfiction:
        Libri after = new Libri("After", "Anna Todd", fanfiction);
        Libri HPboh = new Libri("Harry Potter e i metodi della razionalità", "Eliezer Yudkowsky", fanfiction);
        Libri orgoglioEZombie = new Libri("Orgoglio e pregiudizio e zombie", "Seth Grahame - Smith", fanfiction);
        // Thriller:
        Libri ilCodiceDaVinci = new Libri("Il codice da Vinci", "Dan Brown", triller);
        Libri laRagazzaDelTreno = new Libri("La ragazza del treno", "Paula Hawkins", triller);
        Libri harryQuebert = new Libri("La verità sul caso Harry Quebert", "Joël Dicker", triller);
        // Saggistica:
        Libri sapiens = new Libri("Sapiens.Da animali a dèi", "Yuval Noah Harari", saggistica);
        Libri terraPromessa = new Libri("Una terra promessa", "Barack Obama", saggistica);
        Libri arteVittoria = new Libri("L’arte della vittoria", "Phil Knight", saggistica);
        // Young Adult:
        Libri hungerGames = new Libri("Hunger Games", "Suzanne Collins", youngAdult);
        Libri divergent = new Libri("Divergent", "Veronica Roth", youngAdult);
        Libri colpaDelleStelle = new Libri("Colpa delle stelle", "John Green", youngAdult);

        toAddBook(ilNomeDellaRosa);
        toAddBook(dieciPiccoliIndiani);
        toAddBook(ilSilenzioDegliInnocenti);

        toAddBook(orgoglioEPregiudizio);
        toAddBook(ioPrimaDiTe);
        toAddBook(laRagazzaDiBube);

        toAddBook(dracula);
        toAddBook(shining);
        toAddBook(lEsorcista);

        toAddBook(ilSignoreDegliAnelli);
        toAddBook(HP1);
        toAddBook(narnia);

        toAddBook(uno984);
        toAddBook(ilMondoNuovo);
        toAddBook(guidaGalattica);

        toAddBook(lolita);
        toAddBook(cinquantaSfumature);
        toAddBook(emmanuelle);

        toAddBook(iPilastriDellaTerra);
        toAddBook(ilMedicoDiSaragozza);
        toAddBook(laCattedraleDelMare);

        toAddBook(ilBaroneRampante);
        toAddBook(treUomini);
        toAddBook(diarioSchiappa);

        toAddBook(lIsolaDelTesoro);
        toAddBook(montecristo);
        toAddBook(giro80giorni);

        toAddBook(laVitaDavantiASe);
        toAddBook(ioTina);
        toAddBook(stradaLibertà);

        toAddBook(after);
        toAddBook(HPboh);
        toAddBook(orgoglioEZombie);

        toAddBook(ilCodiceDaVinci);
        toAddBook(laRagazzaDelTreno);
        toAddBook(harryQuebert);

        toAddBook(sapiens);
        toAddBook(terraPromessa);
        toAddBook(arteVittoria);

        toAddBook(hungerGames);
        toAddBook(divergent);
        toAddBook(colpaDelleStelle);

    }


}
