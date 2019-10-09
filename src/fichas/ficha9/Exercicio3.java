package fichas.ficha9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercicio3
{
    public static void main(String[] args)
    {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Valor1");
		map.put(2, "Valor2");
		map.put(3, "Valor3");
		map.put(4, "Valor4");
		map.put(5, "Valor5");

		System.out.println("Valores iniciais: " + map.values());

		ArrayList<Integer> list = new ArrayList<>(map.keySet());

		map.remove(list.get(2));
		map.put(list.get(2), "SOUNOVO");

		System.out.println("Valores finais: " + map.values());
    }
}
