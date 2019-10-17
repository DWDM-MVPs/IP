package fichas.ficha11;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio4
{
    public static void main(String[] args)
    {
        ArrayList<Integer> listnums = new ArrayList<>();
        for (int i = 0; i < 10; i++) listnums.add(new Random().nextInt(1000));
	for (int i = 0; i < 10; i++) System.out.println(listnums.get(i));

	System.out.println("\n");

        System.out.println(DescrobrirMaior(listnums));
    }

    private static int DescrobrirMaior(ArrayList<Integer> list)
    {
        int maior = list.get(0);
        list.remove(0);
        if (list.size() > 0)
	{
	    int met = DescrobrirMaior(list);
	    if (met > maior) maior = met;
	}
        return maior;
    }
}
