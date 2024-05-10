package movimientos;

public abstract class Movimientos {
    protected String tipo;
    protected String nombre;
    protected int accuracy;
    protected int PP;

    public Movimientos(String nombre, int accuracy, int PP, String tipo) {
        this.nombre = nombre;
        this.accuracy = accuracy;
        this.PP = PP;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getPP() {
        return PP;
    }

    public void setPP(int PP) {
        this.PP = PP;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}