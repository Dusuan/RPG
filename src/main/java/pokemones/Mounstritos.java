package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public abstract class Mounstritos {

    protected String sprite;
    protected String name;
    protected int HP;
    protected int ID;
    protected ListaDE<Movimientos> ataques;
    protected int defense;
    protected int ataque;

    public Mounstritos(String name, int HP, int ID, ListaDE<Movimientos> ataques, int defense, int ataque,String sprite) {
        this.name = name;
        this.HP = HP;
        this.ID = ID;
        this.ataques = ataques;
        this.defense = defense;
        this.ataque = ataque;
        this.sprite = sprite;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public int getDefense() {
        return defense;
    }

    public int getAtaque() {
        return ataque;
    }

    public String getSprite() {
        return sprite;
    }

    public int getID() {
        return ID;
    }

    public ListaDE<Movimientos> getAtaques() {
        return ataques;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHP(int HP) {
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

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAtaques(ListaDE<Movimientos> ataques) {
        this.ataques = ataques;
    }

    public abstract void AtaqueTipoEspecial();
}
