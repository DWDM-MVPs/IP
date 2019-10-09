package fichas.ficha7;

import ip.teclado.Teclado;

public class Exercicio4
{
    public static void main(String[] args)
    {
        int tamanho = 0;

        do
	{
	    System.out.println("Insira o tamanho da tabela: "); tamanho = Teclado.lerInt();
	} while (tamanho <= 0);

        int[] tab = new int[tamanho];

        int nums = 0;
        while (nums < tamanho)
	{
	    System.out.printf("Insira um valor para a posição [" + nums + "]: "); int num = Teclado.lerInt();
	    tab[nums] = num;
	    nums++;
	}

        int min = tab[0], max = tab[0], minpos = 0, maxpos = 0;
        for (int i = 1; i < nums; i++)
	{
	    if (tab[i] < min)
	    {
		min = tab[i];
		minpos = i;
	    }
	    if (tab[i] > max)
	    {
		max = tab[i];
		maxpos = i;
	    }
	}

        System.out.println("Minimo: " + min + " (Posição: " + minpos + ")\nMaximo: " + max + " (Posição: " + maxpos + ")");
    }
}
