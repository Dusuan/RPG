package movimientos;

public class Ataques extends Movimientos
{
    private float damage;

    public Ataques(String tipo, String nombre, int accuracy, int PP, float damage) {
        super(tipo, nombre, accuracy, PP);
        this.damage = damage;
    }

    public float getDamage() {
        return damage;
    }
    public void setDamage(float damage) {
        this.damage = damage;
    }
}
