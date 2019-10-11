package fichas.ficha10;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1
{
    public static void main(String[] args)
    {
	List<String> list = new ArrayList<>();
	for (int i = 1; i <= 10; i++) list.add("Pessoa " + i);

	Object resultado = Pesquisa(new ArrayList<Object>(list), "Pessoa 10");

	if (resultado != null) System.out.println("O valor foi encontrado!");
	else System.out.println("O valor não foi encontrado...");
    }

    private static Object Pesquisa(ArrayList<Object> list, Object valor)
    {
	if (list.contains(valor)) return valor;
	return null;
    }
}
