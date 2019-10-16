package fichas.ficha11;

public class Exercicio1
{
    public static void main(String[] args)
    {
	EscreveNum(50);
    }

    static int valor;
    private static void EscreveNum(int max)
    {
        System.out.println(valor);
        valor++;
        if (valor <= max) EscreveNum(max);
    }
}
