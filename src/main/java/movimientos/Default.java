package movimientos;

public class Default extends Movimientos
{
    private int damage;

    public Default(String nombre, int accuracy, int PP, String tipo, float buffStat)
    {
        super(nombre, accuracy, PP, tipo, buffStat);
        this.damage = 10;
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
