package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public abstract class Mounstritos {
    protected String[] Debilidades;

    protected String sprite;
    protected String name;
    protected float HP;
    protected float maxHP;
    protected ListaDE<Movimientos> ataques;
    protected int defense;
    protected int ataque;
    protected boolean vivo;

    public Mounstritos(String name, float HP,float maxHP, ListaDE<Movimientos> ataques, int defense, int ataque,String sprite,boolean vivo, String [] debilidades) {
        this.name = name;
        this.HP = maxHP;
        this.maxHP = maxHP;
        this.ataques = ataques;
        this.defense = defense;
        this.ataque = ataque;
        this.sprite = sprite;
        this.vivo = vivo;
        this.Debilidades = debilidades;
    }

    public String[] getDebilidades() {
        return Debilidades;
    }

    public void setDebilidades(String[] debilidades) {
        Debilidades = debilidades;
    }

    public String getName() {
        return name;
    }

    public float getHP() {
        return HP;
    }

    public float getMaxHP() {
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

    public void setHP(float HP) {
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
    public void setMaxHP(float maxHP) {
        this.maxHP = maxHP;
    }
    public abstract void AtaqueTipoEspecial() throws Exception;
}
