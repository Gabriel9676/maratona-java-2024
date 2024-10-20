package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Cliente {
    private String noma;
    private TipoCliente tipoCliente;

    public Cliente(String noma, TipoCliente tipoCliente) {
        this.noma = noma;
        this.tipoCliente = tipoCliente;
    }

    public String getNoma() {
        return noma;
    }

    public void setNoma(String noma) {
        this.noma = noma;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
