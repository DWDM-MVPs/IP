package fichas.ficha4;

import ip.teclado.Teclado;

public class Exercicio5
{
    public static void main(String[] args)
    {
	System.out.printf("Insira o valor de 'm': "); int m = Teclado.lerInt();

	// EXERCÍCIO 'A'
	int somafor = 0;
	for (int n = 1; n <= m; n++)
	{
	    somafor += n;
	}

	// EXERCÍCIO 'B'
	int somaformula = (1 + m) * m / 2;

	System.out.printf("Resultado: \n> FOR: " + somafor + "\n> Formula: " + somaformula);
    }
}
