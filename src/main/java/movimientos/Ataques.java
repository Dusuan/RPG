package movimientos;

public class Ataques extends Movimientos
{
    private float damage;
    public Ataques(String nombre, int accuracy, int PP, float damage) {
        super(nombre, accuracy, PP);
        this.damage=damage;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
