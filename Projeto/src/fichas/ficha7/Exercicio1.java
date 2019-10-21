package fichas.ficha7;

import ip.teclado.Teclado;

public class Exercicio1
{
    public static void main(String[] args)
    {
	int tamanho = 0;

	do
	{
	    System.out.println("Insira o tamanho da tabela: "); tamanho = Teclado.lerInt();
	} while (tamanho < 2  || tamanho > 9);

	int[] tab = new int[tamanho];

	for (int i = 0; i < tamanho; i++)
	{
	    System.out.printf("Insira um valor: "); tab[i] = Teclado.lerInt();
	}

	System.out.printf("Valores recebidos ao contrário > ");
	for (int i = tamanho - 1; i >= 0; i--)
	{
	    System.out.printf(tab[i] +  "");
	}
    }
}
