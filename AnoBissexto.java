package com.vitorcamara.projetos;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um ano:");
		int ano = scan.nextInt();

		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			//para saber se o ano é bissexto, ele precisa ser divisível por 4,
			//por 100 e por 400. 

			System.out.println("Ano bissexto!");

		} else {
			
			System.out.println("Nao é bissexto!");
		}

	}

}
