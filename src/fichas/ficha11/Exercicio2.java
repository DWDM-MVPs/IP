package fichas.ficha11;

public class Exercicio2
{
    public static void main(String[] args)
    {
	SomaTudoAte(50);
    }

    private static int SomaTudoAte(int max)
    {
        int soma = max;
        if ((max = max - 1) >= 0) soma = soma + SomaTudoAte(max);
        System.out.println(soma);
        return soma;
    }
}