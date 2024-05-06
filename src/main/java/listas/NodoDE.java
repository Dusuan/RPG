package listas;

public class NodoDE<T>
{
    private T datoDE;
    private NodoDE<T>siguienteDE;
    private NodoDE<T>anteriorDE;

    public NodoDE(T dato)
    {
        this.datoDE=dato;
        this.siguienteDE=null;
        this.anteriorDE=null;
    }
    public NodoDE(T dato,NodoDE<T>siguiente, NodoDE<T> anteriorDE )
    {
        this.datoDE=dato;
        this.siguienteDE=siguiente;
        this.anteriorDE=anteriorDE;
    }

    public T getDatoDE() {
        return datoDE;
    }

    public void setDatoDE(T datoDE) {
        this.datoDE = datoDE;
    }

    public NodoDE<T> getSiguienteDE() {
        return siguienteDE;
    }

    public void setSiguienteDE(NodoDE<T> siguienteDE) {
        this.siguienteDE = siguienteDE;
    }

    public NodoDE<T> getAnteriorDE() {
        return anteriorDE;
    }

    public void setAnteriorDE(NodoDE<T> anteriorDE) {
        this.anteriorDE = anteriorDE;
    }
}
