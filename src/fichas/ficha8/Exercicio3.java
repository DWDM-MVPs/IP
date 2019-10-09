package fichas.ficha8;

import java.util.ArrayList;

public class Exercicio3
{
    public static void main(String[] args)
    {
        ArrayList<String> lista = new ArrayList<String>();

        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");

        lista.add("ElementoParaEliminar");
        lista.remove("ElementoParaEliminar");
    }
}
