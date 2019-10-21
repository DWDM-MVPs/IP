package fichas.ficha11;

public class Exercicio1
{
    public static void main(String[] args)
    {
	EscreveNum(50);
    }

    private static void EscreveNum(int max)
    {
        max = max - 1;
        if (max >= 0) EscreveNum(max);
        System.out.println(max + 1);
    }
}