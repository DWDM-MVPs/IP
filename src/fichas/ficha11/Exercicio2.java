package fichas.ficha11;

public class Exercicio2
{
    public static void main(String[] args)
    {
	SomaTudoAte(50, 0, 0);
    }

    private static void SomaTudoAte(int max, int valor, int soma)
    {
        valor++;
        soma += valor;
        System.out.println(soma);
        if (valor <= max) SomaTudoAte(max, valor, soma);
    }
}
