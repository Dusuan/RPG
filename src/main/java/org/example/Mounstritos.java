package org.example;

import listas.ListaDE;

public abstract class Mounstritos {

    private String sprite;
    private String name;
    private int HP;
    private int ID;
    private ListaDE<movimientos> ataques;
    private int defense;
    private int ataque;

    public Mounstritos(String name, int HP, int ID, ListaDE<movimientos> ataques, int defense, int ataque,String sprite) {
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

    public abstract void AtaqueTipoEspecial();
}
