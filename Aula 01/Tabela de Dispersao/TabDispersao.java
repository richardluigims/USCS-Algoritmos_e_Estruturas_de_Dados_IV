public class TabDispersao
{
    private int tabela[];
    
    public TabDispersao(int capMax)
    {
        tabela = new int[capMax];
    }

    public int fDispersao(int chave)
    {
        return chave - 1;
    }

    public void adiciona(int chave, int quant)
    {
        int aux = fDispersao(chave);
        
        if (aux >= 0 && aux < tabela.length)
        {
            tabela[aux] = quant;
        } else {
            System.out.print("O valor da chave é incorreto.");
        }
    }

    public int remove(int chave)
    {
        int aux = -1;
        int aux2 = fDispersao(chave);
        
        if (aux2 >= 0 && aux2 < tabela.length)
        {
            aux = tabela[aux2];
            tabela[aux2] = 0;
        } else {
            System.out.print("O valor da chave é inválido.");
        }
        
        return aux;
    }

    public String toString()
    {
        String r = "";
        for (int i = 0; i < tabela.length; i++)
        {
            r = r + (i + 1) + " = " + tabela[i] + '\n';
        }
        
        return r;
    }
}
