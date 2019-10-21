package fichas.ficha8;

import java.util.ArrayList;

public class Exercicio4
{
    public static void main(String[] args)
    {
	ArrayList<String> lista = new ArrayList<String>();

	lista.add("1");
	lista.add("2");
	lista.add("3");
	lista.add("4");

	lista.set(1, "redefine");
    }
}
