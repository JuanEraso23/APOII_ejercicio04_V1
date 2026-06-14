package context;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Atributos
        float num = sc.nextFloat();
        
        //Menu
        if (num == 1) {
            System.out.print("Lunes");
        } else if (num == 2) {
            System.out.print("Martes");
        } else if (num == 3) {
            System.out.print("Miércoles");
        } else if (num == 4) {
        	System.out.print("Jueves");
        } else if (num == 5) {
            System.out.print("Viernes");
        } else if (num == 6) {
        	System.out.print("Sábado");
        } else if (num == 7) {
            System.out.print("Domingo");
        } else {
            System.out.print("!ERROR!");
            System.out.print("No coincide con un día de la semana");
            sc.close();
        }
	}

}
