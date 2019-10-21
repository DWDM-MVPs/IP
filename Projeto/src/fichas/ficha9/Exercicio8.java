package fichas.ficha9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercicio8
{
    public static void main(String[] args)
    {
		ArrayList<String> list = new ArrayList<>();
		Map<Integer, String> map = new HashMap<>();

		list.add("Valor1");
		list.add("Valor2");
		list.add("Valor3");
		list.add("Valor4");
		list.add("Valor5");

		for (int i = 0; i < list.size(); i++)
		{
			if (!map.containsValue(list.get(i))) map.put(i, list.get(i));
		}
    }
}
