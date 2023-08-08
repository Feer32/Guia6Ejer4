package guia6ejer4;

import java.util.Scanner;

public class Guia6Ejer4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        try {
            System.out.println("Ingrese el primer numero");
            String num1 = leer.nextLine();

            System.out.println("Ingrese el segundo numero");
            String num2 = leer.nextLine();

            int numero1 = Integer.parseInt(num1);
            int numero2 = Integer.parseInt(num2);

            int resultado = numero1 / numero2;

            System.out.println("El resultado de la division es: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Se produjo un error de formato. Ingrese numeros validos");
        } catch (ArithmeticException e) {
            System.out.println("Se produjo un error aritmetico. Asegurese de no dividir por 0");
        } catch (Exception e) {
            System.out.println("Se produjo un error inseperado " + e.getMessage());
        }
        finally{
            System.out.println("Final del proceso");
        }
    }

}
