package movimientos;

public class buff extends Movimientos{

    private float buffStat;
    private boolean buffActivado;
    public buff(String nombre, int accuracy, int PP, float buffStat, String tipo) {
        super(nombre, accuracy, PP, tipo);
        this.buffStat=buffStat;
        this.buffActivado=false;
    }
    public float getBuffStat() {
        return buffStat;
    }
    public void setBuffStat(float buffStat) {
        this.buffStat = buffStat;
    }

    public boolean isBuffActivado() {
        return buffActivado;
    }

    public void setBuffActivado(boolean buffActivado) {
        this.buffActivado = buffActivado;
    }
}
