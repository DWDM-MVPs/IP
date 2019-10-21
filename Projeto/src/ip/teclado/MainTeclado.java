package ip.teclado;

import java.util.Scanner;

public class MainTeclado
{
    public static void main(String[] args)
    {
        String str;
        float x;
        double y;
        int z;

        System.out.println("Introduza uma string");
        str = Teclado.lerString();
        System.out.println("Introduza um float");
        x=Teclado.lerFloat();
        System.out.println("Introduza um double");
        y=Teclado.lerDouble();
        System.out.println("Introduza um int");
        z=Teclado.lerInt();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza uma string");
        str = sc.nextLine();

        System.out.println("Introduza um float");
        x = sc.nextFloat();

        System.out.println("Introduza um double");
        y = sc.nextDouble();

        System.out.println("Introduza um int");
        z = sc.nextInt();

        System.out.println("String introduzido = "+str);
        System.out.println("Float introduzido = "+x);
        System.out.println("Double introduzido = "+y);
        System.out.println("Int introduzido = "+z);

    }
}