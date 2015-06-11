package Interfaz;

import java.util.Scanner;

public class Principal {		

	public static void main(String[] args) {
		int valor1 = 0;
		int valor2 = 0;
		int op = 0;	
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el primer Valor:");
		valor1 = entrada.nextInt();
		System.out.println("Ingrese el segundo Valor");
		valor2 = entrada.nextInt();
		System.out.println("Ingrese un numero dependiendo de la operacion");
		System.out.println("suma: 1,");
		System.out.println("resta: 2,");
		System.out.println("Multiplicacion: 3");
		op = entrada.nextInt();
		
		if(op == 1){
			int resultado= valor1 + valor2;
			System.out.println("Resultador: "+resultado);
		}
		if (op== 2){
			
			int resultado= valor1 - valor2;
			System.out.println("Resultador: "+resultado);
		}
		if(op==3){
			
			int resultado=valor1 * valor2;
			System.out.println("Resultado: "+resultado);
		}
		 
	}

}

