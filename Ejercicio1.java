import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        Boolean menuActivo = true;
        int eleccion;

        System.out.println("Escribe el radio de la base de tu cilindro:  ");
        double radio = sc.nextDouble();
        System.out.println("Escribe la altura de tu cilindro: ");
        double altura = sc.nextDouble();
        do {
            menu();
            eleccion = sc2.nextInt();
            if (eleccion == 1) {
                areaBase(radio, altura);
            }
            else if (eleccion == 2) {
                areaLateral(radio, altura);
            }
            if (eleccion == 3) {
                areaTotal(radio, altura);
            }
            if (eleccion == 4) {
                volumenCilindro(radio, altura);
            }
            if (eleccion == 5) {
                menuActivo = false;
            }
        } while (menuActivo);

    }

    public static void menu(){
        System.out.println(" Seleccione la operación que desea realizar: ");
        System.out.println("1. Calcular el area de la base del cilindro: ");
        System.out.println("2 .Calcular el area lateral del cilindro: ");
        System.out.println("3. Calcular el area total del cilindro:");
        System.out.println("4. Calcular el volumen del cilindro: ");
        System.out.println("5. Salir");
    }

    public static double areaBase (double radio, double altura){
        double areaBase = Math.PI*(Math.pow(radio, 2));
        System.out.println("El area de la base: "+areaBase);
        return areaBase;
    }

    public static double areaLateral (double radio, double altura){
        double areaLateral = (2*Math.PI*radio*altura);
        System.out.println("El area lateral es"+areaLateral);
        return areaLateral;
    }

    public static double areaTotal (double radio, double altura){
        double areaBase = Math.PI*(Math.pow(radio, 2));
        double areaLateral = (2*Math.PI*radio*altura);
        double areaTotal = (2*areaBase)+ areaLateral;
        System.out.println("El area total es: "+areaTotal);
        return areaTotal;
    }

    public static double volumenCilindro (double radio, double altura){
        double areaBase = Math.PI*(Math.pow(radio, 2));
        double volumenCilindro = areaBase * altura;
        System.out.println("El volumen del cilindro es: "+volumenCilindro);
        return volumenCilindro;
    }
}
