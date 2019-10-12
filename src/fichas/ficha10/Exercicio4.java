package fichas.ficha10;

import ip.teclado.Teclado;
import jdk.nashorn.internal.objects.annotations.Function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercicio4
{
    static Map<Integer, String> contactos = new HashMap<>();

    public static void main(String[] args)
    {
        contactos.put(1, "Contacto 1");
        contactos.put(2, "Contacto 2");
        contactos.put(3, "Contacto 3");

        int menu = 0;

        do
        {
            System.out.println("Menu: ");
            System.out.println("[1] Pesquisar por número de telefone.");
            System.out.println("[2] Pesquisar por nome.");
            System.out.printf("Escolha: "); menu = Teclado.lerInt();
        } while (menu != 1 && menu != 2);

        if (menu == 1) PesquisarPorNumero();
        else if (menu == 2) PesquisarPorNome();

        System.out.println("Contactos finais: " + contactos.toString());
    }

    private static void PesquisarPorNumero()
    {
        System.out.printf("Insira o número de telefone a pesquisar: "); int num = Teclado.lerInt();

        if (contactos.containsKey(num))
        {
            System.out.println("O registo foi encontrado. Pertence a: " + contactos.get(num));

            System.out.printf("Deseja redefinir o nome associado ao contacto? (Y) > "); char redef = Teclado.lerString().toLowerCase().charAt(0);
            if (redef == 'y') RedefinirNome(num);
        }
        else System.out.println("O número não pertence a ninguém.");
    }

    private static void RedefinirNome(int num)
    {
        System.out.printf("Insira o novo nome: "); String nome = Teclado.lerString();
        contactos.replace(num, nome);
        System.out.println("O contacto foi redefinido!");
    }

    private static void PesquisarPorNome()
    {
        System.out.printf("Insira o nome a pesquisar: "); String nome = Teclado.lerString();

        if (contactos.containsValue(nome))
        {
            ArrayList<Integer> numeros = new ArrayList<>(); // Numeros que o nome tem
            ArrayList<Integer> keycontactos = new ArrayList<>(contactos.keySet()); // Keys do dicionario

            for (int i = 0; i < keycontactos.size(); i++)
            {
                if (contactos.get(keycontactos.get(i)) == nome) numeros.add(keycontactos.get(i));
            }

            System.out.println("Contactos que pertencem ao nome:");
            System.out.println("index: " + numeros.size());
            for (int i = 0; i < numeros.size(); i++)
            {
                System.out.println("[" + i + "] " + numeros.get(i));
            }

            System.out.printf("Pretende editar algum número? Se sim, insira o index: "); int index = Teclado.lerInt();
            if (index >= 0 && index <= numeros.size()) RedefinirNumero(numeros.get(index));
        }
        else System.out.println("Esse nome não tem contactos associados.");
    }

    private static void RedefinirNumero(int num)
    {
        System.out.printf("Insira o novo número: "); int novonum = Teclado.lerInt();
        String nome = contactos.get(num);
        contactos.remove(num);
        contactos.put(num, nome);
        System.out.println("O contacto foi redefinido!");
    }
}
