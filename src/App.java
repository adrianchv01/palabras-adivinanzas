import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentos<intentosMaximos) {
            //El String.valueOf nos permite unir las letras
            System.out.println("Palabra a adivinar:" + String.valueOf(letrasAdivinadas)+ ("Letras a adivinar: " + palabraSecreta.length()) );

            System.out.println("Introduce una letra, por favor");

            //CharAt(posicion de la letra) = nos devuelve la posicion puesta
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos ++;
                System.out.println("!Incorrecto! te quedan " + (intentosMaximos - intentos)+ " Intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {

                palabraAdivinada= true;
                System.out.println("!Felicidades has adivinado la palabra secreta: " + palabraSecreta);
                
            }
        }
        if (!palabraAdivinada) {
            System.out.println("Te quedaste sin intentos");
        }

        scanner.close();

    }
}
