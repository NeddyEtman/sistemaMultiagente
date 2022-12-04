package Models;

public class Base {

private int id;
private int nandina;
private int comentario;

public Base() {
}

    public Base(int id, int nandina, int comentario) {
        this.id = id;
        this.nandina = nandina;
        this.comentario = comentario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNandina() {
        return nandina;
    }

    public void setNandina(int nandina) {
        this.nandina = nandina;
    }

    public int getComentario() {
        return comentario;
    }

    public void setComentario(int comentario) {
        this.comentario = comentario;
    }
}