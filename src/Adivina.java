import java.util.Scanner;

public class Adivina {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intentos = 0;
        int intetosMaximos = 10;
        boolean adivino = false;
        String palabra = "fuerte";

        char[] letraAdivinada = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            letraAdivinada[i] = '_';
        }

        while (!adivino && intentos<intetosMaximos) {
            boolean correcto = false;

            System.out.println("Ingresa una letra a adivinar: "+ String.valueOf(letraAdivinada) + " Intentos disponibles: " + (intetosMaximos-intentos));
            char letra = sc.next().charAt(0);

            for (int i = 0; i < palabra.length(); i++) {
                
                if (letra==palabra.charAt(i)) {
                    letraAdivinada[i] = letra;
                    correcto = true;
                }
            }
            if (!correcto) {
                intentos++;
                System.out.println("Intentos: "+ (intetosMaximos-intentos));
            }
            if (String.valueOf(letraAdivinada).equals(palabra)) {
                adivino=true;
                System.out.println("Felicidad lograste juntar las palabras");
            }
            if (intetosMaximos-intentos==0) {
                System.out.println("Te quedaste sin intentos");
            }
            

            
        }

        sc.close();
    }

}
