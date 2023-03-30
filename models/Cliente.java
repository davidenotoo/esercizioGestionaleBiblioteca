package esercizioGestionaleBiblioteca.models;

public class Cliente {
    private String nomeCliente;
    private String cognomeCliente;
    private Integer etaCliente;
    private boolean accessoEta;
    private String codiceUnivoco;
    private Integer numeroLibriDaRestituire;
    private Integer storicoLibri;


    public Cliente() {
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCognomeCliente() {
        return cognomeCliente;
    }

    public void setCognomeCliente(String cognomeCliente) {
        this.cognomeCliente = cognomeCliente;
    }

    public Integer getEtaCliente() {
        return etaCliente;
    }

    public void setEtaCliente(Integer etaCliente) {
        this.etaCliente = etaCliente;
    }

    public boolean accessoEta() {
        return accessoEta;
    }

    public void setAccessoEta(boolean accessoEta) {
        this.accessoEta = accessoEta;
    }

    private void attivatoreContenuti() {
        if (etaCliente > 14) {
            setAccessoEta(true);
        } else {
            setAccessoEta(false);
        }
    }

    public String getCodiceUnivoco() {
        return codiceUnivoco;
    }

    public void setCodiceUnivoco(String codiceUnivoco) {
        this.codiceUnivoco = codiceUnivoco;
    }

    public boolean isAccessoEta() {
        return accessoEta;
    }

    public Integer getNumeroLibriDaRestituire() {
        return numeroLibriDaRestituire;
    }

    public void setNumeroLibriDaRestituire(Integer numeroLibriDaRestituire) {
        this.numeroLibriDaRestituire = numeroLibriDaRestituire;
    }

    public Integer getStoricoLibri() {
        return storicoLibri;
    }

    public void setStoricoLibri(Integer storicoLibri) {
        this.storicoLibri = storicoLibri;
    }

    @Override
    public String toString() {
        return "\uD83E\uDDD1\uD83C\uDFFD   " + nomeCliente + " " + cognomeCliente + "\n🎂   " + etaCliente + " anni\n" + "\uD83D\uDCB3   Codice CARD: " + codiceUnivoco + "\nn° libri da restituire: " + numeroLibriDaRestituire + " ";
    }
}
