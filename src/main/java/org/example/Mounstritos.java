package org.example;

public abstract class Mounstritos {

    private String name;
    private int HP;
    private int defense;
    private int ataque;

    public Mounstritos(String name, int HP, int defense, int ataque) {
        this.name = name;
        this.HP = HP;
        this.defense = defense;
        this.ataque = ataque;
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
}
