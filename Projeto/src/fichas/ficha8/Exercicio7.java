package fichas.ficha8;

import java.util.ArrayList;

public class Exercicio7
{
    public static void main(String[] args)
    {
	ArrayList<String> lista = new ArrayList<String>();

	lista.add("a"); // 1
	lista.add("b"); // 2
	lista.add("c"); // 3
	lista.add("d"); // 4
	lista.add("e"); // 5
	lista.add("f"); // 6
	lista.add("g"); // 7
	lista.add("h"); // 8
	lista.add("i"); // 9
	lista.add("j"); // 10

	System.out.println(lista.toString() + " - " + lista.size());

	lista.set(1, "alterar2");
	lista.set(3, "alterar4");
	lista.set(5, "alterar6");

	System.out.println(lista.toString() + " - " + lista.size());
    }
}
