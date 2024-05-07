package movimientos;

public class Default extends Movimientos
{
    private int damage;
    public Default(String nombre, int accuracy, int PP) {
        super(nombre, accuracy, PP);
        this.damage=10;
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
