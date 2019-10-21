package fichas.ficha10;

import java.util.ArrayList;

public class Exercicio3
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);

        System.out.println("Lista inicial: " + list.toString());
        list = SelectionSort(list);
        System.out.println("Lista inicial ordenada: " + list.toString());

        list.add(6);
        list.add(5);
        list.add(4);

        System.out.println("Lista com mais valores: " + list.toString());
        list = SelectionSort(list);
        System.out.println("Lista com mais valores ordenada: " + list.toString());
    }

    private static ArrayList<Integer> SelectionSort(ArrayList<Integer> list)
    {
        int min, size = list.size();
        ArrayList<Integer> listord = new ArrayList<>();

        while (listord.size() < size)
        {
            min = list.get(0);
            int minindex = 0;
            for (int i = 0; i < list.size(); i++)
            {
                if (list.get(i) < min)
                {
                    min = list.get(i);
                    minindex = i;
                }
            }
            list.remove(minindex);
            listord.add(min);
        }

        return listord;
    }
}
