package fichas.ficha7;

import ip.teclado.Teclado;

public class Exercicio2
{
    public static void main(String[] args)
    {
	int[] tab = new int[8];
	int nums = 0;

	while (nums < 8)
	{
	    int num;
	    System.out.printf("Insira um número inteiro: "); num = Teclado.lerInt();

	    tab[nums] = num;
	    nums++;
	}

	int soma = 0;
	for (int i = 0; i < 8; i++)
	{
	    soma += tab[i];
	}

	System.out.println("Soma: " + soma);
    }
}
