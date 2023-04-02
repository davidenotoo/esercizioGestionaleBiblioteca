package esercizioGestionaleBiblioteca.models;

public class Libri {
    private String titoloLibro;
    private String autoreLibro;
    private Generi genere;
    private LibriDB disponibilita;

    public Libri(String titoloLibro, String autoreLibro, Generi genere) {
        this.titoloLibro = titoloLibro;
        this.autoreLibro = autoreLibro;
        this.genere = genere;
    }

    public String getTitoloLibro() {
        return titoloLibro;
    }

    public void setTitoloLibro(String titoloLibro) {
        this.titoloLibro = titoloLibro;
    }

    public String getAutoreLibro() {
        return autoreLibro;
    }

    public void setAutoreLibro(String autoreLibro) {
        this.autoreLibro = autoreLibro;
    }

    public Generi getGenere() {
        return genere;
    }

    public void setGenere(Generi genere) {
        this.genere = genere;
    }

    public LibriDB getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(LibriDB disponibilita) {
        this.disponibilita = disponibilita;
    }

    @Override
    public String toString() {
        return titoloLibro + ", di: " + autoreLibro + ", genere: " + genere + ", " + disponibilita + "\n";
    }
}
