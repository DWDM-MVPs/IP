package fichas.ficha11;

public class Exercicio5
{
    public static void main(String[] args)
    {
	System.out.println(CalculoPotencia(8, 3));
    }

    private static int CalculoPotencia(int num, int potencia)
    {
        int resultado = num * num;
        potencia = potencia - 1;
        if (potencia > 1) resultado = CalculoPotencia(num, potencia) * num;
        return resultado;
    }
}