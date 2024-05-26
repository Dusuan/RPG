package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public abstract class Mounstritos {
    protected String[] Debilidades;
    protected String sprite;
    protected String name;
    protected double HP;
    protected double maxHP;
    protected ListaDE<Movimientos> ataques;
    protected int ultimate;
    protected int defense;
    protected boolean vivo;
    private boolean buffActivado;
    private boolean debuffActivado;

    public Mounstritos(String name, double HP,double maxHP, ListaDE<Movimientos> movimientosTotales,int ultimate, int defense,String sprite,boolean vivo) throws Exception {
        this.name = name;
        this.HP = maxHP;
        this.maxHP = maxHP;
        this.ataques = new ListaDE<>(); // lo inicializo como una lista vacia
        this.defense = defense;
        this.sprite = sprite;
        this.vivo = vivo;
        this.Debilidades = setDebilidades(); // Asi queda inicializado dependiendo de cada tipaje
        this.buffActivado = false;
        this.debuffActivado = false;
        this.ultimate = ultimate;

        // Metodo para conseguir los movimientos al azar y sin duplicados por mousntrito

        Random random = new Random();
        Set<Integer> movSelecccionado = new HashSet<>(); // Cree un nuevo Hash Set para guardar los indices

            while(ataques.size() < 4){ // Lo puse en 4 en lo mientras, aunque no se si el buff va a estar de afuerzas en los 4 movimientos // Juan: no necesariamente
            if (movimientosTotales.empty()) {
                break;
            }

                int index = random.nextInt(movimientosTotales.size()); // se busca el index al azar dependiendo del tamaño de la lista

            if(!movSelecccionado.contains(index)){
                 ataques.adicionar(movimientosTotales.obtener(index));// al final se añade el ataque o healing encontrado al Mousntrito
                 movSelecccionado.add(index);
            }

        }

    }


    public String getDebilidades1() {
        return Debilidades[0];
    }
    public String getDebilidades2() {
        return Debilidades[1];
    }

    public abstract String[] setDebilidades(); // Implemente un metodo abstracto ya que no se inicializaba bien con lo pasada porque aun me pedia las debilidades como parametro y para quitarlo no se podia

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

    public int getUltimate() {
        return ultimate;
    }

    public void setUltimate(int ultimate) {
        this.ultimate = ultimate;
    }
}


