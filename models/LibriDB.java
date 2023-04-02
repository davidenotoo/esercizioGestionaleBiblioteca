package esercizioGestionaleBiblioteca.models;

public class LibriDB {
    private Integer numeroCopieTOT = 2;
    private Integer numeroCopiePresenti = 1;
    private Integer numeroCopiePrestate = 1;

    public LibriDB(Integer numeroCopieTOT, Integer numeroCopiePresenti, Integer numeroCopiePrestate) {
        this.numeroCopieTOT = numeroCopieTOT;
        this.numeroCopiePresenti = numeroCopiePresenti;
        this.numeroCopiePrestate = numeroCopiePrestate;
    }

    public Integer getNumeroCopieTOT() {
        return numeroCopieTOT;
    }

    public void setNumeroCopieTOT(Integer numeroCopieTOT) {
        this.numeroCopieTOT = numeroCopieTOT;
    }

    public Integer getNumeroCopiePresenti() {
        return numeroCopiePresenti;
    }

    public void setNumeroCopiePresenti(Integer numeroCopiePresenti) {
        this.numeroCopiePresenti = numeroCopiePresenti;
    }

    public Integer getNumeroCopiePrestate() {
        return numeroCopiePrestate;
    }

    public void setNumeroCopiePrestate(Integer numeroCopiePrestate) {
        this.numeroCopiePrestate = numeroCopiePrestate;
    }

    @Override
    public String toString() {
        return numeroCopieTOT + " " + numeroCopiePresenti + " " + numeroCopiePrestate ;
    }
}
