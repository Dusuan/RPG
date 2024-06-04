package listas;

public class ListaDE<T> implements Interface<T>
{
    private NodoDE <T> headDE;
    public ListaDE()
    {}
    @Override
    public boolean empty()
    {
        return headDE==null;
    }


    @Override
    public int size() {
        int contador = 0;
        NodoDE<T> current = headDE;
        while (current != null) {
            contador++;
            current = current.getSiguienteDE();
        }
        return contador;
    }

    @Override
    public void adicionar(T x)
    {
        NodoDE<T> nodo= new NodoDE<>(x);
        if(empty())
        {
            headDE=nodo;
        }
        else
        {
            NodoDE<T> actual = headDE;
            while (actual.getSiguienteDE() != null)
            {
                actual = actual.getSiguienteDE();
            }
            actual.setSiguienteDE(nodo);
            nodo.setAnteriorDE(actual);
        }
    }


    @Override
    public void eliminar(int posicion) throws Exception
    {
        if(empty())
        {
            throw new Exception("");
        }
        if (posicion < 0 || posicion > size())
        {
            throw new Exception("Error, posición fuera de rango");
        }
        if (posicion == 0)
        {
            headDE = headDE.getSiguienteDE();
        }
        else
        {
            NodoDE<T> anterior = headDE;
            for (int i = 0; i < posicion - 1; i++) {
                anterior = anterior.getSiguienteDE();
            }//     x
            //0 1 2 3 4 5
            //    y
            NodoDE<T> nodoEliminar = anterior.getSiguienteDE();
            anterior.setSiguienteDE(nodoEliminar.getSiguienteDE());
            if (nodoEliminar.getSiguienteDE() != null)
            { // Verificar si el nodo a eliminar no es el último
                nodoEliminar.getSiguienteDE().setAnteriorDE(anterior);
            }
        }
    }

    @Override
    public T obtener(int posicion) throws Exception
    {
        if(empty())
        {
            throw new Exception("");
        }
        if (posicion < 0 || posicion > size())
        {
            throw new Exception("Error, posición fuera de rango");
        }
        NodoDE<T> actual = headDE;
        for (int i = 0; i < posicion; i++)
        {
            actual = actual.getSiguienteDE();
        }
        return actual.getDatoDE();
    }


    public void SwapPoke(int poke)
    {
        try
        {
            T pokemon = obtener(poke);
            eliminar(poke);
            adicionar(pokemon);
        }
        catch(Exception e){
            System.out.println("Algo ocurrio relacionado a SwapPoke");
        }
    }









}
