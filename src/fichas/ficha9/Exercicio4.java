package fichas.ficha9;

import ip.teclado.Teclado;

import java.util.HashMap;
import java.util.Map;

public class Exercicio4
{
    public static void main(String[] args)
    {
	Map<Integer, String> map = new HashMap<>();

	System.out.println("Insira a chave do registo: "); int chave = Teclado.lerInt();

	map.put(1, "Valor1");
	map.put(2, "Valor2");
	map.put(3, "Valor3");


	if (map.containsKey(chave)) System.out.println("O dicinário tem a chave '" + chave + "'");
	else System.out.println("O dicionário não tem a chave '" + chave + "'...");
    }
}
