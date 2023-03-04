public class No
{
    public int dado; //usamos CLASSE (produto) ao invés de tipo primitivo (int, float, etc) para guardar mais de um dado
    public No prox;
    
    public No (int e) //int e = elemento
    {
        dado = e;
        prox = null;
    }
}
