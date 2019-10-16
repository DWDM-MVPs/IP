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
        // O código espera que a função no 'if' imprima a mensagem, o que faz com que a primeira call seja a última
        // a ser imprimida e a última a ser a primeira a ser imprimida.

        char letra = texto.charAt(0);
        if (letra != ' ') InverterSeq(texto.substring(1));
        System.out.println(letra);
    }
}
