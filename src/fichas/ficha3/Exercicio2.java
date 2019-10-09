package fichas.ficha3;

import ip.teclado.Teclado;

import java.util.Scanner;

public class Exercicio2
{
    public static void main(String[] args)
    {
	String escolha;

	System.out.printf("Scanner ou Teclado? > "); escolha = Teclado.lerString();

	switch (escolha.toLowerCase())
	{
	    case "scanner":
	        Scanner2();
	    case "teclado":
	        Teclado2();
	}
    }

    static int i;
    static String s;
    static float f;
    static double d;

    public static void Scanner2()
    {
	Scanner sc = new Scanner(System.in);

        System.out.printf("Insira um 'int': "); i = sc.nextInt();
        System.out.printf("Insira um 'String': "); s = sc.next();
        System.out.printf("Insira um 'float': "); f = sc.nextFloat();
        System.out.printf("Insira um 'double': "); d = sc.nextDouble();

        Imprimir();
    }

    public static void Teclado2()
    {
	System.out.printf("Insira um 'int': "); i = Teclado.lerInt();
	System.out.printf("Insira um 'String': "); s = Teclado.lerString();
	System.out.printf("Insira um 'float': "); f = Teclado.lerFloat();
	System.out.printf("Insira um 'double': "); d = Teclado.lerDouble();

	Imprimir();
    }

    public static void Imprimir()
    {
        System.out.printf("Valores recebidos: i = " + i + "\ns = " + s + "\nf = " + f + "\nd = " + d);
        System.exit(0);
    }
}
