package fichas.ficha6;

import ip.teclado.Teclado;

import java.text.DecimalFormat;

public class Ficha6
{
    public static void main(String[] args)
    {
        while (true)
	{
	    String selecao;

	    System.out.printf("Menu:\n[A] Verificar se um número é impar.\n[B] Verificar se um número é primo.\n[C] Número é par/impar//primo/nao primo até ser introduzido número negativo.\n[D] 100 primeiros números primos.\n[F] Converter Temperatura.\n\n[0] PARA SAIR\n\n\nEscolha > "); selecao = Teclado.lerString();

	    switch (selecao.toLowerCase())
	    {
		case "a":
		    AlineaA(); break;
		case "b":
		    AlineaB(); break;
		case "c":
		    AlineaC(); break;
		case "d":
		    AlineaD(); break;
		case "f":
		    AlineaF(); break;
		case "0":
		    System.exit(0);
	    }

	    System.out.printf("\n\n\n");
	}
    }

    public static boolean IsPrimeNumber(int _Number)
    {
	for (int _Loop = 2; _Loop < _Number; _Loop++)
	{
	    if (_Number % _Loop == 0)
	    {
		return false;
	    }
	}
	return _Number > 1;
    }

    public static void AlineaA()
    {
        int num;

        System.out.printf("Insira um número: "); num = Teclado.lerInt();

        if (num % 2 == 0) System.out.printf("O número é par.");
        else System.out.printf("O número é impar.");
    }

    public static void AlineaB()
    {
        int num;

        System.out.printf("Insira um número: "); num = Teclado.lerInt();

        if (IsPrimeNumber(num)) System.out.printf("O número é primo.");
        else System.out.printf("O número não é primo.");
    }

    public static void AlineaC()
    {
	int num = 1;

	while (num > 0)
	{
	    System.out.printf("Insira um número (negativo/0 para sair): "); num = Teclado.lerInt();

	    if (num > 0)
	    {
	        if (num % 2 == 0 && IsPrimeNumber(num)) System.out.println("O número é par e é primo.");
	        else if (num % 2 == 0 && !IsPrimeNumber(num)) System.out.println("O número é par e não é primo");
	        else if (num % 2 != 0 && IsPrimeNumber(num)) System.out.println("O número é impar e é primo.");
	        else System.out.println("O número é impar e não é primo.");
	    }
	}
    }

    public static void AlineaD()
    {
	int primos = 0, count = 0;

        while (primos <= 100)
	{
	    count ++;

	    if (IsPrimeNumber(count))
	    {
	        System.out.printf(count + ", ");
	        primos++;
	    }
	}
    }

    public static void AlineaF()
    {
	DecimalFormat df = new DecimalFormat("#.#");

        for (int i = 0; i <= 40; i += 2)
	{
	    System.out.printf(i + "ºC = " + df.format(1.8 * i + 32) + " ºF\n");
	}
    }
}
