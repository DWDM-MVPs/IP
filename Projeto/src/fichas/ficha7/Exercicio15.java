package fichas.ficha7;

	import ip.teclado.Teclado;

public class Exercicio15
{
    public static void main(String[] args)
    {
	String frase;

	System.out.printf("Insira uma frase: "); frase = Teclado.lerString();

	int vogais = 0;
	int outras = 0;
	for (char letra : frase.toLowerCase().toCharArray())
	{
	    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
	    {
		vogais++;
	    }
	    else outras++;
	}

	System.out.println("MÉTODO 1:\nVogais: " + vogais + " Consoantes: " + outras);
	System.out.println("MÉTODO 2:\nVogais: " + vogais + " Consoantes: " + (frase.length() - vogais));
    }
}
