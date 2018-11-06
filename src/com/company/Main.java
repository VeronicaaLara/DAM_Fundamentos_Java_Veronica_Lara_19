package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// pedir una nota entre 0 y 10
        //mostrar el valor en letra ( cero, uno...)

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota entre 0 y 10");
        int nota = sc.nextInt();
        String calif="";

        switch (nota){
            case 0: calif = "CERO";
            break;
            case 1: calif = "UNO";
            break;
            case 2: calif = "DOS";
            break;
            case 3: calif = "TRES";
            break;
            case 4: calif = "CUATRO";
            break;
            case 5: calif = "CINCO";
            break;
            case 6: calif = "SEIS";
            break;
            case 7: calif = "SIETE";
            break;
            case 8: calif = "OCHO";
            break;
            case 9: calif = "NUEVE";
            break;
            case 10: calif = "DIEZ";
            break;
        }
        System.out.println("La nota es:" + calif);
        sc.close();

    }
}
