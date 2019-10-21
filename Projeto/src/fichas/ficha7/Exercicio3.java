package fichas.ficha7;

import ip.teclado.Teclado;

public class Exercicio3
{
    public static void main(String[] args)
    {
	int[] tab = new int[6];
	int nums = 0;

	while (nums < 6)
	{
	    System.out.printf("Insira um número: "); int num = Teclado.lerInt();

	    tab[nums] = num;
	    nums++;
	}

	int somapar = 0;
	for (int i = 0; i < 6; i++)
	{
	    if (tab[i] % 2 == 0)
	    {
		somapar += tab[i];
	    }
	}

	System.out.println("Soma dos números pares: " + somapar);
    }
}
