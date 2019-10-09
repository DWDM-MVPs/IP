package fichas.ficha9;

import ip.teclado.Teclado;

import java.util.HashMap;
import java.util.Map;

public class Exercicio6
{
    private static Map<String, String> map = new HashMap<>();

    public static void main(String[] args)
    {
	map.put("123456781", "User1");
	map.put("123456782", "User2");
	map.put("123456783", "User3");
	map.put("123456784", "User4");
	map.put("123456785", "User5");

	System.out.println("Insira o número de telefone: "); String nome = UtilizadorDoNumero(Teclado.lerString());

	if (!nome.isEmpty()) System.out.println("O número '" + nome + "' pertence a: " + map.get(nome));
	else System.out.println("Esse número não existe");
    }

    private static String UtilizadorDoNumero(String numero)
    {
        if (map.containsKey(numero)) return map.get(numero);
        else return null;
    }
}
