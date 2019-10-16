package fichas.ficha11;

public class Exercicio2
{
    public static void main(String[] args)
    {
	SomaTudoAte(50);
    }

    static int valor, soma;
    private static void SomaTudoAte(int max)
    {
        valor++;
        soma += valor;
        System.out.println(soma);
        if (valor <= max) SomaTudoAte(max);
    }
}
