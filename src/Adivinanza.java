import java.util.Scanner;

public class Adivinanza {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int intentos = 0;
        int intentosMaximos= 10;
        Boolean adivino = false;
        String palabraAdivinada = "constructor";

        char[] letraAdivinada = new char[palabraAdivinada.length()];

        for(int i = 0 ; i < palabraAdivinada.length();i++){

            letraAdivinada[i]= '_';
          
        }

        while (!adivino && intentos<intentosMaximos) {
            System.out.println(letraAdivinada);

            System.out.println(" Adivina una letra de la palabra:");
            char letra = scanner.next().charAt(0);

            boolean correcta = false;
                
            
            
            for(int i= 0; i <palabraAdivinada.length(); i++){
                

                if (palabraAdivinada.charAt(i)==letra) {
                    
                    letraAdivinada[i]= letra;
                    correcta = true;
                    
                }
                

                
            } 
            if (String.valueOf(letraAdivinada).equals(palabraAdivinada)) {
                adivino=true;
                System.out.println("Felicidades Adivinaste la palabra");
            } 
            
            if(!correcta){
                intentos ++;
                System.out.println("Intestos faltantes: " +(intentosMaximos-intentos));
            } 

            if (intentosMaximos- intentos==0) {
                System.out.println("Te quedaste sin intentos!");
            }
            
            

           
            

        }   
        
        

        scanner.close();

    }

}
