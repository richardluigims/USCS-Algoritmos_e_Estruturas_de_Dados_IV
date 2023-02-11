/******************************************************************************

Exemplo de Tabela de Dispersão

Autor: Richard
Data: 10/02/2023

*******************************************************************************/
public class Main
{
	public static void main(String[] args)
	{
		TabDispersao t = new TabDispersao(100);
		
		t.adiciona(1, 14);
		t.adiciona(3, 75);
		t.adiciona(100, 99);
		
		System.out.println("Tabela\n" + t.toString());
		
		int i = t.remove(1);
		
		System.out.println("Tabela\n" + t.toString());
	}
}
