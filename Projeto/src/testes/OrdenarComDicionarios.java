package testes;

import ip.teclado.Teclado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OrdenarComDicionarios
{
    public static void main(String[] args)
    {
        Map<Integer, Integer> map = new HashMap<>();

        int num = 0, index = 0, nums = 0;

        do
	{
	    System.out.printf("Insira a quantidade de número a receber: "); nums = Teclado.lerInt();
	} while (nums <= 0);

	ArrayList<Integer> list = new ArrayList<>();

        while (index < nums)
	{
	    System.out.printf("Insira o número para o index '" + index + "': "); num = Teclado.lerInt();

	    list.add(num);
	    index++;
	}

        for (int i = 0; i < index; i++)
	{
	    map.put(list.get(i), list.get(i));
	}

        System.out.println("Numeros inseridos ordenados: " + map.values());
    }
}
