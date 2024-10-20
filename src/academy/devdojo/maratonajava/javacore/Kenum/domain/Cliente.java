package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Cliente {
    private String noma;
    private String tipo;

    public Cliente(String noma, String tipo) {
        this.noma = noma;
        this.tipo = tipo;
    }

    public String getNoma() {
        return noma;
    }

    public void setNoma(String noma) {
        this.noma = noma;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
