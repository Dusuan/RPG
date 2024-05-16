package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public abstract class Mounstritos {
    protected String[] Debilidades;

    protected String sprite;
    protected String name;
    protected double HP;
    protected double maxHP;
    protected ListaDE<Movimientos> ataques;
    protected int defense;
    protected int ataque;
    protected boolean vivo;
    private boolean buffActivado;
    private boolean debuffActivado;

    public Mounstritos(String name, double HP,double maxHP, ListaDE<Movimientos> ataques, int defense, int ataque,String sprite,boolean vivo, String [] debilidades) {
        this.name = name;
        this.HP = maxHP;
        this.maxHP = maxHP;
        this.ataques = ataques;
        this.defense = defense;
        this.ataque = ataque;
        this.sprite = sprite;
        this.vivo = vivo;
        this.Debilidades = debilidades;
        this.buffActivado = false;
        this.debuffActivado = false;
    }

    public String getDebilidades1() {
        return Debilidades[0];
    }
    public String getDebilidades2() {
        return Debilidades[1];
    }

    public void setDebilidades(String[] debilidades) {
        Debilidades = debilidades;
    }

    public String getName() {
        return name;
    }

    public double getHP() {
        return HP;
    }

    public double getMaxHP() {
        return maxHP;
    }
    public int getDefense() {
        return defense;
    }

    public int getAtaque() {
        return ataque;
    }

    public boolean isVivo() {
        return vivo;
    }
    public String getSprite() {
        return sprite;
    }

    public ListaDE<Movimientos> getAtaques() {
        return ataques;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public void setAtaques(ListaDE<Movimientos> ataques) {
        this.ataques = ataques;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public void setMaxHP(double maxHP) {
        this.maxHP = maxHP;
    }
    public abstract void AtaqueTipoEspecial() throws Exception;

    public boolean isBuffActivado() {
        return buffActivado;
    }

    public void setBuffActivado(boolean buffActivado) {
        this.buffActivado = buffActivado;
    }


    public boolean isDebuffActivado() {
        return debuffActivado;
    }

    public void setDebuffActivado(boolean debuffActivado) {
        this.debuffActivado = debuffActivado;
    }
}
