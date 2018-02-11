/**
 * Write a description of class numeroPrimo here.
 * 
 * @authors
 * Juan Carlos Monsalve Torres
 * Ronal Mauricio Reales Fernandez
 * Luis David Roa Saavedra
 * 
 */
import java.util.Scanner;
public class numeroPrimo
{
	public static void main (String[] arg)
	{
		int num, div, residuo;
		long segundos1, segundos2, tiempo;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Universidad EAN");
		System.out.println("Construccion de SW");
		System.out.println();
		
		System.out.print("Digite el número a evaluar: ");
		num = teclado.nextInt();
		System.out.println();
		
		segundos1=System.currentTimeMillis();
		
		if(num==1)
		{
			System.out.println("Es un número primo");
		}
		else
		{
			residuo = 0;
			for(div=1;div<=num;div++)
			{
				if((num%div)==0)
				{
					residuo++;
				}
			}
			if(residuo==2)
			{
				System.out.println("Es un número primo");
			}
			else
			{
				System.out.println("No es un número primo");
			}
		}
		segundos2=System.currentTimeMillis();
		tiempo = segundos2-segundos1;
		System.out.println("Tiempo transcurrido "+tiempo+" milsegundos");
	}
}