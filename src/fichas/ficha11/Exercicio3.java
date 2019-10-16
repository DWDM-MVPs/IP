package fichas.ficha11;

public class Exercicio3
{
    public static void main(String[] args)
    {
        System.out.println("Número de algarismos: " + NumAlgarismos(670));
    }

    static int algs;
    private static int NumAlgarismos(int num)
    {
        algs += 1;
        if (algs < String.valueOf(num).length()) NumAlgarismos(num);
        return algs;
    }
}