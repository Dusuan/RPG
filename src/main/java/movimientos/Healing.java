package movimientos;

public class Healing extends Movimientos{

    private int heal;
    public Healing(String nombre, int accuracy, int PP,int heal, String tipo) {
        super(nombre, accuracy, PP, tipo);
        this.heal=heal;
    }
    public int getHeal() {
        return heal;
    }
    public void setHeal(int heal) {
        this.heal = heal;
    }
}
