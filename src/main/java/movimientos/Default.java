package movimientos;

public class Default extends Movimientos
{
    private int damage;


    public Default(String tipo, String nombre, int accuracy, int PP, int damage) {
        super(tipo, nombre, accuracy, PP);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
    public int attack(int vida)
    {
        int newVida=vida-getDamage();
        return newVida;
    }
}
