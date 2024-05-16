package movimientos;

public class Healing extends Movimientos{

    private int heal;

    public Healing(String tipo, String nombre, int accuracy, int PP, int heal) {
        super(tipo, nombre, accuracy, PP);
        this.heal = heal;
    }

    public int getHeal() {
        return heal;
    }
    public void setHeal(int heal) {
        this.heal = heal;
    }
}
