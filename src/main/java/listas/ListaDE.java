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
    public void insertar(T x, int posicion) throws Exception {
        if (posicion < 0 || posicion > size())  // poner || empty() ya que en el caso de usar la posicion 0,
        //implica que la lista debe tener minimo algo
        {
            throw new Exception("Error, posición fuera de rango");
        }
        NodoDE<T> nodo = new NodoDE<>(x);
        if (posicion == 0)
        {
            //esto es por si la posicion 0 esta ocupada por head=null;
            if (headDE != null) { // Verificar si la lista no está vacía,
                // ya que en caso de no estarla nodo se pone antes de head, y head puede apuntar hacia nodo
                // para atras
                nodo.setSiguienteDE(headDE);
                headDE.setAnteriorDE(nodo);
            }
            // en caso de head ser null, solo head se vuelve nodo
            headDE = nodo;
        }
        else
        {
            NodoDE<T> anterior = headDE;
            for (int i = 0; i < posicion - 1; i++) {
                anterior = anterior.getSiguienteDE();
            }
            nodo.setSiguienteDE(anterior.getSiguienteDE());
            //en caso de que no estemos apuntando a la ultima posicion, pues el siguiente a esta es null
            if (anterior.getSiguienteDE() != null)
            {
                anterior.getSiguienteDE().setAnteriorDE(nodo);//la que esta en la posoicion apunta al nuevo nodo
            }

            anterior.setSiguienteDE(nodo);
            nodo.setAnteriorDE(anterior);
        }
    }

    @Override
    public void eliminar(T x, int posicion) throws Exception
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

    @Override
    public T buscar(T x) throws Exception
    {
        if(empty())
        {
            throw new Exception("");
        }
        NodoDE<T> actual = headDE;
        while (actual != null)
        {
            if (actual.getDatoDE().equals(x))
            {
                return actual.getDatoDE();
            }
            actual = actual.getSiguienteDE();
        }
        throw new Exception("El dato no se encontró en la lista");
    }
}
