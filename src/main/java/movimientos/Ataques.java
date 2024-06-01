package movimientos;

public class Ataques extends Movimientos {
    private float damage;
    private boolean ataqueEfectivo;  // Cree este atributo para checar si el pokemon fallo el ataque, lo voy a necesitar para la implementacion de la ulti

    public Ataques(String tipo, String nombre, int accuracy, int PP, float damage) {
        super(tipo, nombre, accuracy, PP);
        this.damage = damage;
        this.ataqueEfectivo = true;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public boolean isAtaqueEfectivo() {
        return ataqueEfectivo;
    }

    public void setAtaqueEfectivo(boolean ataqueEfectivo) {
        this.ataqueEfectivo = ataqueEfectivo;
    }
}
