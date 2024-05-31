package movimientos;

public class Default extends Movimientos
{
    private int damage;

    public Default(String tipo, String nombre, int accuracy, int PP) {
        super(tipo, nombre, accuracy, PP);
        this.damage = 20;
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
