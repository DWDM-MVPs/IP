package fichas.ficha7;

import ip.teclado.Teclado;

public class Exercicio8
{
    public static void main(String[] args)
    {
	int tamanho = 0;

	do
	{
	    System.out.printf("Insira a quantidade de números a inserir: "); tamanho = Teclado.lerInt();
	} while (tamanho < 0);

	int[] tab = new int[tamanho];


	for (int i = 0; i < tamanho; i++)
	{
	    System.out.printf("Insira o valor [" + i + "] da tebela: "); tab[i] = Teclado.lerInt();
	}


	int mindif = Integer.MAX_VALUE;
	int index1 = 0, index2 = 0;

	for (int i = 0; i < tamanho; i++)
	{
	    for (int i2 = i + 1; i2 < tamanho; i2++)
	    {
		int abs = Math.abs(tab[i] - tab[i2]);

		if (abs < mindif)
		{
		    mindif = abs;
		    index1 = i;
		    index2 = i2;
		}
	    }
	}

	System.out.printf("Diferença: " + mindif + " Posição I: " + index1 + " Posição II: " + index2);
    }
}
