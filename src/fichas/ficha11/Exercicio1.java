package fichas.ficha11;

public class Exercicio1
{
    public static void main(String[] args)
    {
	EscreveNum(50, 0);
    }

    private static void EscreveNum(int max, int valor)
    {
        System.out.println(valor);
        valor++;
        if (valor <= max) EscreveNum(max, valor);
    }
}
