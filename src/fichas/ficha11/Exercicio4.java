package fichas.ficha11;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio4
{
    public static void main(String[] args)
    {
        ArrayList<Integer> listnums = new ArrayList<>();
        for (int i = 0; i < 10; i++) listnums.add(new Random().nextInt(1000));

        DescrobrirMaior(listnums, 0);
        System.out.println(maior);
    }

    static int maior;
    private static void DescrobrirMaior(ArrayList<Integer> list, int index)
    {
        if (list.get(index) > maior) maior = list.get(index);
	index += 1;
        if (index < list.size()) DescrobrirMaior(list, index);
    }
}
