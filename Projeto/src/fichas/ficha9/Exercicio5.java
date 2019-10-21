package fichas.ficha9;

import java.util.HashMap;
import java.util.Map;

public class Exercicio5
{
    public static void main(String[] args)
    {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Ana");
		map.put(2, "Carla");
		map.put(3, "Patrícia");
		map.put(4, "Ana");
		map.put(5, "Maria");

		for(int i = 0; i < map.size(); i++)
		{
			if (map.get(i) == "Ana") map.remove(i);
		}
    }
}
