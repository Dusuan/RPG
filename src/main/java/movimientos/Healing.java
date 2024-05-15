package movimientos;

public class Healing extends Movimientos{

    private int heal;

    public Healing(String nombre, int accuracy, int PP, String tipo, float buffStat, int heal) {
        super(nombre, accuracy, PP, tipo, buffStat);
        this.heal = heal;
    }

    public int getHeal() {
        return heal;
    }
    public void setHeal(int heal) {
        this.heal = heal;
    }
}
