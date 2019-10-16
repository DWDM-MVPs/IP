package exemplos;

import java.io.Console;

public class Exemplo6
{
    public static void main(String[] args)
    {
        InverterSeq("estv ");
    }

    static void InverterSeq(String texto)
    {
        char letra = texto.charAt(0);
        if (letra != ' ') InverterSeq(texto.substring(1));
        System.out.println(letra);
    }
}
