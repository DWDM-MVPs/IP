package ip.teclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado
{

    /*
     * (1) Leitura de uma String
     */
    public static String lerString()
    {
        String my_String = null;

        try
        {
            InputStreamReader leitor = new InputStreamReader(System.in);
            BufferedReader entrada = new BufferedReader(leitor);
            my_String = entrada.readLine();
        }

        catch (IOException erro)
        {
            System.exit(0);
        }

        return my_String;
    }

    /*
     * (2) Leitura de um Float
     */
    public  static float lerFloat()
    {
        float my_Float = 0;

        try
        {
            String my_String = lerString();
            my_Float = Float.parseFloat(my_String);
        }

        catch (NumberFormatException erro)
        {
            System.out.println("Erro de dado (float)");
            System.exit(0);
        }

        return my_Float;
    }

    /*
     * (3) Leitura de um Double
     */
    public  static double lerDouble()
    {
        double my_Double = 0;

        try
        {
            String my_String = lerString();
            my_Double = Double.parseDouble(my_String);
        }

        catch (NumberFormatException erro)
        {
            System.out.println("Erro de dado (double)");
            System.exit(0);
        }

        return my_Double;
    }

    /*
     * (4) Leitura de um Integer
     */
    public  static int lerInt()
    {
        int my_Int = 0;

        try
        {
            String my_String = lerString();
            my_Int = Integer.parseInt(my_String);
        }

        catch (NumberFormatException erro)
        {
            System.out.println("Erro de dado (int)");
            System.exit(0);
        }

        return my_Int;
    }
}