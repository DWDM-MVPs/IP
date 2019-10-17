package fichas.ficha11;

public class Exercicio5
{
    public static void main(String[] args)
    {
	System.out.println(CalculoPotencia(8, 3, 0));
    }

    private static int CalculoPotencia(int num, int potencia, int resultado)
    {
        if (resultado == 0) resultado = num;
        potencia--;
        if (potencia >= 1) resultado = CalculoPotencia(num, potencia, resultado) * num;
        return resultado;
    }
}