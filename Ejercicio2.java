import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    HashMap <String, Integer> personas = personaLista();

    // Hago el bucle for que identifica si tiene +18 años en el main, pero perfectamente lo podria haber hecho en la misma funcion.
    // Asi ves que he utilizado la funcion y el dato que me ha devuelto la función.

    for (HashMap.Entry<String, Integer> entry : personas.entrySet()) {
        if (entry.getValue() > 18) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    }

    public static HashMap <String, Integer> personaLista (){
        Scanner sc = new Scanner(System.in);
        String nombrePersona = "";
        int edad;

        HashMap <String, Integer> personas = new HashMap<>();
        while (!nombrePersona.equals("fin")) {
            System.out.println("Ingrese nombre(o fin para terminar): ");
            nombrePersona = sc.next();
            if (nombrePersona.equals("fin")) {
                break;
            }
            System.out.println("Ingrese edad ");
            edad = sc.nextInt();
            personas.put(nombrePersona, edad);
        }
 
    return personas;
    }
}
