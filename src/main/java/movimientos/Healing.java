package movimientos;

public class Healing extends Movimientos{

    private float heal;
    public Healing(String nombre, int accuracy, int PP,float heal, String tipo) {
        super(nombre, accuracy, PP, tipo);
        this.heal=heal;
    }
    public float getHeal() {
        return heal;
    }
    public void setHeal(int heal) {
        this.heal = heal;
    }

}
