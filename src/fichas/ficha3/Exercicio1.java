package fichas.ficha3;

import ip.teclado.Teclado;

import java.util.Scanner;

public class Exercicio1
{
    public static void main(String[] args)
    {
        String exercicio;

        System.out.printf("Insira a letra do exercício: "); exercicio = Teclado.lerString();


        switch (exercicio)
	{
	    case "a":
	        Exercicio1a();
	    case "b":
	        Exercicio1b();
	    case "c":
	        Exercicio1c();
	    case "d":
	        Exercicio1d();
	    case "e":
	        Exercicio1e();
	}
    }

    private static void Exercicio1a()
    {
        int numero = 0;

        System.out.printf("Insira um número: "); numero = Teclado.lerInt();
        System.out.printf(numero + " + 1 = " + (numero + 1));

        System.exit(0);
    }

    private static void Exercicio1b()
    {
        Boolean l1 = false, l2 = false;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira um valor para L1 (true/false): "); l1 = sc.nextBoolean();
        System.out.printf("Insira um valor para L2 (true/false): "); l2 = sc.nextBoolean();


        System.out.printf("L = " + (l1 == false && l2 == false));

        System.exit(0);
    }

    private static void Exercicio1c()
    {
        int par = 0;

        System.out.printf("Insira um número par: "); par = Teclado.lerInt();

        System.out.printf("O número inserido é par: " + (par % 2 == 0));


        System.exit(0);
    }

    private static void Exercicio1d()
    {
	int n1 = 0;

	System.out.printf("Insira um número múltiplo de 2: "); n1 = Teclado.lerInt();

	System.out.printf("O número inserido é multiplo de 2: " + (n1 % 2 == 0));


	System.exit(0);
    }

    private static void Exercicio1e()
    {
        int x = 0, y = 0;

        System.out.printf("Insira um número para 'X':" ); x = Teclado.lerInt();
        System.out.printf("Insira um número para 'Y': "); y = Teclado.lerInt();

        System.out.printf("X é maior que Y: " + (x > y));

        System.exit(0);
    }
}
