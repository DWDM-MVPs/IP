package fichas.ficha10;

import java.util.ArrayList;

public class Exercicio2
{
    public static void main(String[] args)
    {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(3);
		list.add(7);

		System.out.println("Valores iniciais: " + list.toString());
		list = InsertInPlace(list, 2);
		System.out.println("Valores finais: " + list.toString());
    }

    private static ArrayList<Integer> InsertInPlace(ArrayList<Integer> list, int inserir)
    {
        ArrayList<Integer> listord = new ArrayList<>();
        boolean inserido = false;

		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(i);
			System.out.println(list.size());

			if (inserir < list.get(i) && inserido == false)
			{
				listord.add(inserir);
				inserido = true;
			}
			else if (inserir > list.get(i) && i + 1 == list.size())
			{
				listord.add(list.get(i));
				listord.add(inserir);
				break;
			}
			listord.add(list.get(i));
		}

		return listord;
    }
}
