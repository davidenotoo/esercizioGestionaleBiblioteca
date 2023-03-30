package Biblioteca.models;

public class Cliente {
    private String nomeCliente;
    private String cognomeCliente;
    private Integer etaCliente;
    private boolean accessoEta;

    public Cliente() {
        attivatoreContenuti();
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

    @Override
    public String toString() {
        return nomeCliente + " " + cognomeCliente + " " + etaCliente + " anni" ;
    }
}
