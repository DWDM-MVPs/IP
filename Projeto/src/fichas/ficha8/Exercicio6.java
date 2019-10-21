package fichas.ficha8;

import java.util.ArrayList;

public class Exercicio6
{
    public static void main(String[] args)
    {
	ArrayList<Integer> lista = new ArrayList<Integer>();

	lista.add(1);
	lista.add(2);
	lista.add(3);
	lista.add(4);
	lista.add(5);

	System.out.println(lista.size());

	lista.remove(2);

	System.out.println(lista.toString());

	lista.clear();
    }
}
