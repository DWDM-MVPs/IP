package ip.raizes;

	import ip.teclado.Teclado;

public class MainRaizes
{
    public static void main(String[] args)
    {
	double a = 0, b = 0, c = 0;
	double x1 = 0, x2 = 0;

	System.out.printf("Insira A: "); a = Teclado.lerDouble();
	System.out.printf("Insira B: "); b = Teclado.lerDouble();
	System.out.printf("Insira C: "); c = Teclado.lerDouble();

	double raiz = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
	x1 = (-b + raiz) / (2 * a);
	x2 = (-b - raiz) / (2 * a);

	System.out.printf("Pos > " + x1 + "\nNeg > " + x2);
    }
}
