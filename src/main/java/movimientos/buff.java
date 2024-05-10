package movimientos;

public class buff extends Movimientos{

    private float buffStat;
    public buff(String nombre, int accuracy, int PP, float buffStat, String tipo) {
        super(nombre, accuracy, PP, tipo);
        this.buffStat=buffStat;
    }
    public float getBuffStat() {
        return buffStat;
    }
    public void setBuffStat(float buffStat) {
        this.buffStat = buffStat;
    }
}
