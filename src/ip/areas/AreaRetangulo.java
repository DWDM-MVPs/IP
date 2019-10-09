package ip.areas;

import ip.teclado.Teclado;

public class AreaRetangulo
{
    public static void main(String[] args)
    {
	double a = 0, b = 0;

	System.out.printf("Insira A: "); a = Teclado.lerDouble();
	System.out.printf("Insira B: "); b = Teclado.lerDouble();

	System.out.printf("Area: " + a * b);
    }
}
