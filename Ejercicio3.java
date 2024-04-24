import java.io.File;
import java.util.Scanner;
import java.util.HashMap;


public class Ejercicio3 {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
   Boolean menu = true;
   int eleccion;

   HashMap <String, Integer> alumnos = new HashMap<>();
   alumnos.put("Juan Pérez Martinez", 7);
   alumnos.put("María Garcia López", 8);
   alumnos.put("Carlos Martinez Rodriguez", 6);
   alumnos.put("Ana Rodriguez ", 9);
   alumnos.put("Pedro Lopez Garcia ", 5);
   alumnos.put("Laura Fernandez Martinez", 7);
   alumnos.put("Javier Gonzalez lopez", 8);
   alumnos.put("Andrea Diaz Martinez ", 6);
   alumnos.put("Daniel Hernández Perez ", 9);
   alumnos.put("Sofía García pérez ", 1);
   alumnos.put("Marta Perez Garcia", 5);
   alumnos.put("Alejandro Sanchez Martinez", 7);
   alumnos.put("Paula Martin Lopez", 8);
   alumnos.put("David Ruiz Rodriguez", 6);
   alumnos.put("Sandra Jimenez Perez ", 9);
   alumnos.put("Sergio Perez Martinez ", 5);
   alumnos.put("Luis Rodriguez Fernández", 4);
   alumnos.put("Elena Martinez Garcia", 3);
   alumnos.put("Mario Lopez Rodriguez", 2);
   alumnos.put("Jorge Pérez Martinez", 0);


  do {
    menu();
    eleccion = sc.nextInt();
    if (eleccion == 1) {
        alumnosAprobados(alumnos);
    }
    if (eleccion == 2) {
        cantidadAprobados(alumnos);
    }
    if (eleccion == 3){
        alumnosSuspensos(alumnos);
    }
    if (eleccion == 4) {
        cantidadSuspensos(alumnos);
    }
    if (eleccion == 5) {
        porcentajeAprobados(cantidadSuspensos(alumnos), cantidadAprobados(alumnos));
    }
    if (eleccion == 6) {
        porcentajeSuspensos(cantidadSuspensos(alumnos), cantidadAprobados(alumnos));
    }
    if (eleccion == 7) {
        menu = false;
    }
  } while (menu);

   
    
    }

    public static void menu (){
        System.out.println("---Menú---");
        System.out.println("1. Relación de alumnos que han aprobado.");
        System.out.println("2. Cuantos alumnos han aprobado. ");
        System.out.println("3. Relación de alumnos que han suspendido. ");
        System.out.println("4. Cuantos alumnos han suspendido");
        System.out.println("5. Porcentaje de aprobados.");
        System.out.println("6. Porcentaje de suspensos.");
        System.out.println("7. Salir");
    }

    public static void alumnosAprobados (HashMap<String, Integer> alumnos){
        for (HashMap.Entry<String, Integer> entry : alumnos.entrySet()) {
            if (entry.getValue() > 5) {
                System.out.println(entry.getKey()+": "+entry.getValue());
            }
        }
    }
    public static int cantidadAprobados (HashMap<String, Integer> alumnos){
        int cantidadAprobados = 0;
        for (HashMap.Entry<String, Integer> entry : alumnos.entrySet()) {
            if (entry.getValue() > 5) {
                cantidadAprobados++;
            }
        }
        System.out.println("Han aprobado"+cantidadAprobados);
        return cantidadAprobados;
    }
    public static void alumnosSuspensos(HashMap<String, Integer> alumnos){
        for (HashMap.Entry<String, Integer> entry : alumnos.entrySet()) {
            if (entry.getValue() < 5) {
                System.out.println(entry.getKey()+": "+entry.getValue());
            }
        }
    }
    public static int cantidadSuspensos (HashMap<String, Integer> alumnos){
        int cantidadSuspensos = 0;
        for (HashMap.Entry<String, Integer> entry : alumnos.entrySet()) {
            if (entry.getValue() < 5) {
                cantidadSuspensos++;
            }
        }
        System.out.println("Cantidad Suspensos: "+cantidadSuspensos);
        return cantidadSuspensos;
    }
    public static float porcentajeAprobados (int cantidadSuspensos, int cantidadAprobados){
        int numeroTotalAlumnos = cantidadAprobados + cantidadSuspensos;
        System.out.println("Numero total alumnos: "+numeroTotalAlumnos);
        float porcentajeAprobados = (cantidadAprobados / numeroTotalAlumnos)*100;
        System.out.println("El porcentaje de aprobados es: "+porcentajeAprobados+"%");
        return porcentajeAprobados;
    }
    public static float porcentajeSuspensos (int cantidadSuspensos, int cantidadAprobados){
        int numeroTotalAlumnos = cantidadAprobados + cantidadSuspensos;
        System.out.println("numero total de alumnos: "+numeroTotalAlumnos);
        float porcentajeSuspensos = (cantidadSuspensos / numeroTotalAlumnos) *100;
        System.out.println("El porcentaje de suspensos es: "+porcentajeSuspensos+"%");
        return porcentajeSuspensos;
    }

}
