public class ListaLigada
{
    private No inicio;
    
    public ListaLigada()
    {
        inicio = null;
    }
    
    public void adiciona(int e) //int e = elemento
    {
        No novo = new No(e);
        
        //lista está vazia, então adicionamos no início
        if (inicio = null)
        {
            inicio = novo;
        } else { //agora temos 1 elemento na lista (está no início)
            if (e < inicio.dado)
            { //o novo dado é menor que aquele do início
                novo.prox = inicio; //mandamos o valor de início para o proximo
                inicio = novo; //adicionamos o novo dado no início
            } else { //novo dado é maior que o do inicio
                if (inicio.prox == null) //o único dado da lista ainda é o do início
                {
                    inicio.prox = novo; //então adicionamos o novo dado logo depois
                } else {//agora temos mais de 1 dado na lista
                    No aux1 = inicio, aux2 = inicio;
                    //verificando os dados
                    while (aux1 != null && e > aux1.dado)
                    {
                        aux2 = aux1;
                        aux1 = aux1.prox;
                    }
                    if (aux1 == null) //novo dado é o maior da lista, adiciona na última casa que é null
                    {
                        aux2.prox = novo;
                    } /*inserir no meio de dois nós */ else {
                        novo.prox = aux1;
                        aux2.prox = novo;
                    }
                }
            }
        }
    }
    
    public int remove (int e)
    {
        int r = -1;
        
        if (inicio == null)
        {
            System.out.println("ERRO! Lista vazia.");
        } else {
            if (e == inicio.dado) //remover do início
            {
                r = inicio.dado;
                inicio = inicio.prox;
            } else {
                No aux1 = inicio, aux2 = inicio;
                
                while (aux1 != null && aux1.dado != e)
                {
                    aux2 = aux1;
                    aux1 = aux1.prox;
                }
                if (aux1.dado == e)
                {
                    r = aux1.dado;
                    aux2.prox = aux1.prox;
                } else {
                    System.out.println("O destino não foi localizado.");
                }
            }
        }
        return r;
    }
}
