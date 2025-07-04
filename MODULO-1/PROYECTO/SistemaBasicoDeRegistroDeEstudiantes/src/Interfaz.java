import java.util.Scanner;

public class Interfaz {

   public static void mostrarMenu(){
    Scanner scanner = new Scanner(System.in);
    boolean salir = false;
    int opcion = 0;
    RegistrarLaInformacionDelEstudiante estudiante = new RegistrarLaInformacionDelEstudiante();

        do{

            System.out.println("--- Sistema de Registro de Estudiantes ---");
            System.out.println("""
            1. Registrar datos de un estudiante
            2. Mostrar datos del estudiante actual
            3. Calcular promedio de notas del estudiante actual
            0. Salir
            Ingrese su opción:
            """);
            
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1: System.out.println("--- Registrar datos de un estudiante ---");
                        System.out.println("----------------------------------------");
                        scanner.nextLine();
                        System.out.println("Ingrese el nombre del estudiante:");
                        String nombre = scanner.nextLine();
                        if(!RegistrarLaInformacionDelEstudiante.validarNombre(nombre)) {
                            System.out.println("Nombre inválido. Intente de nuevo.");
                            break;
                        }
                        System.out.println("Ingrese la nota 1:");
                        double nota1 = scanner.nextDouble();
                        if(!RegistrarLaInformacionDelEstudiante.validarNota(nota1)) {
                            System.out.println("Nota inválida. Debe estar entre 0 y 100.");
                            break;
                        }
                        System.out.println("Ingrese la nota 2:");
                        double nota2 = scanner.nextDouble();
                        if(!estudiante.validarNota(nota2)) {
                            System.out.println("Nota inválida. Debe estar entre 0 y 100.");
                            break;
                        }
                        System.out.println("Ingrese la nota 3:");
                        double nota3 = scanner.nextDouble();
                        if(!estudiante.validarNota(nota3)) {
                            System.out.println("Nota inválida. Debe estar entre 0 y 100.");
                            break;
                        }
                        estudiante = new RegistrarLaInformacionDelEstudiante(nombre, nota1, nota2, nota3);
                        System.out.println("Estudiante registrado con éxito.");
                    break;

                case 2: estudiante.mostrarInfoEstudiante();
                   
                    
                break;

                case 3: double promedio = estudiante.calcularPromedio();
                        if(promedio != -1) {
                            System.out.println("El promedio de notas del estudiante es: " + promedio);
                        }
                break;

                case 0: System.out.println("Saliendo del sistema...");
                        scanner.close();
                        salir = true; 
                        break;

                default:
                    break;
            }

        }while(!salir);
      
    }
   }
    

