package movimientos;

public class Ataques extends Movimientos
{
    private float damage;

    public Ataques(String nombre, int accuracy, int PP, String tipo, float buffStat, float damage) {
        super(nombre, accuracy, PP, tipo, buffStat);
        this.damage = damage;
    }

    public float getDamage() {
        return damage;
    }
    public void setDamage(float damage) {
        this.damage = damage;
    }
}
