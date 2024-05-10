package listas;

public interface Interface<T>
{
    public boolean empty();
    public int size();
    public void adicionar(T x);
    public void insertar (T x, int posicion) throws Exception;
    public void eliminar (int posicion) throws Exception;
    public T obtener(int posicion) throws Exception;
    public T buscar (T x) throws Exception; // es de tipo int o T
}
