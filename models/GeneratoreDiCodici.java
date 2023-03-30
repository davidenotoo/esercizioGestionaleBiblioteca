package esercizioGestionaleBiblioteca.models;

import java.util.Random;

public class GeneratoreDiCodici {
    private static final int CODE_LENGTH = 5; // lunghezza del codice
    private static final Random random = new Random();
    public static String generate() {
        StringBuilder sb = new StringBuilder(CODE_LENGTH);
        for (int i = 0; i < CODE_LENGTH; i++) {
            sb.append(random.nextInt(10)); // aggiunge un numero casuale tra 0 e 9
        }
        return sb.toString();
    }

}
