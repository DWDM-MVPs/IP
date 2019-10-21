package fichas.ficha7;

import ip.teclado.Teclado;

public class Exercicio6
{
    public static void main(String[] args)
    {
	int tamanho = 0;

	do
	{
	    System.out.println("Insira um tamanho para as tabelas: "); tamanho = Teclado.lerInt();
	} while (tamanho <= 0);

	int[] tab1 = new int[tamanho]; // Tabela 1
	int[] tab2 = new int[tamanho]; // Tabela 2
	int[] tab3 = new int[tamanho * 2]; // Tabela Mistura
	int[] tab4 = new int[tamanho]; // Tabela 2 ao contrário

	for (int i = 1; i <= 2; i++)
	{
	    int nums = 0;
	    while (nums < tamanho)
	    {
		System.out.printf("Insira o valor [" + nums + "] para a tabela " + i + ": "); int num = Teclado.lerInt();

		if (i == 1) tab1[nums] = num;
		else tab2[nums] = num;

		nums++;
	    }
	}

	int index = 0;
	for (int i = tamanho - 1; i >= 0; i --)
	{
	    tab4[index] = tab2[i];
	    index++;
	}


	int index2 = 0;
	for(int index1 = 0; index1 < tamanho; index1++)
	{
	    tab3[index2] = tab1[index1];
	    index2++;
	    tab3[index2] = tab4[index1];
	    index2++;
	}


	System.out.println("Valores misturados: ");
	for (int i = 0; i < tamanho * 2; i++)
	{
	    System.out.printf(tab3[i] + " ");
	}
    }
}
