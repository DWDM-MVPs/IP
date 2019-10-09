package exemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Exemplo1
{
    public static void main(String[] args)
    {
	ArrayList<String> listaTextos = new ArrayList<>();

	listaTextos.add("Elemento1");
	listaTextos.add(0, "Elemento0");
	listaTextos.add("Elemento2");
	listaTextos.remove(0);
	listaTextos.remove("Elemento2");

	listaTextos.set(0, "Unico Sobrevivente");

	//listaTextos.clear();
	if (listaTextos.contains("Elemento2"))
	{
	    System.out.println("Elemento2 encontrado.");
	}

	System.out.println("Elemento2 está na posição " + listaTextos.indexOf("Elemento2"));

	listaTextos.clear();
	listaTextos.add("c");
	listaTextos.add("d");
	listaTextos.add("b");
	Collections.sort(listaTextos);

	ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
	listaNumeros.add(4);
	listaNumeros.add(2);
	listaNumeros.add(1);
	listaNumeros.add(3);
	Collections.sort(listaNumeros);

	System.out.println(new StringBuilder().append("Tamanho da lista: ").append(listaTextos.size()).append("."));
	System.out.println(listaNumeros.get(0));
    }

    public static ArrayList TrocarPosicoes(ArrayList listaEntrada, int pos1, int pos2)
    {
        Object auxiliar = listaEntrada.get(pos1);
        listaEntrada.set(pos1, listaEntrada.get(pos2));
        listaEntrada.set(pos2, auxiliar);
        return listaEntrada;
    }
}
