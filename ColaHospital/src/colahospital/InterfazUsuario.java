/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colahospital;

/**
 *
 * @author Luis
 */
import java.util.Scanner;

public class InterfazUsuario {
    private static final Scanner entrada = new Scanner(System.in);

    public static int mostrarMenu() {
        System.out.println("\n--- SISTEMA HOSPITALARIO ---");
        System.out.println("1. Añadir paciente");
        System.out.println("2. Atender paciente");
        System.out.println("3. Mostrar cola de pacientes");
        System.out.println("4. Salir");
        System.out.print("elija una opcion: ");
        return entrada.nextInt();
    }

    public static Paciente pedirDatosPaciente() {
        entrada.nextLine(); 
        
        System.out.print("\nnombre del paciente ");
        String nombre = entrada.nextLine();
        
        System.out.print("edad ");
        int edad = entrada.nextInt();
        
        int prioridad;
        do {
            System.out.print("prioridad (1 para grave, 2 para Normal) ");
            prioridad = entrada.nextInt();
        } while (prioridad != 1 && prioridad != 2);
        
        entrada.nextLine();
        System.out.print("motivo de consulta ");
        String motivo = entrada.nextLine();
        
        return new Paciente(nombre, edad, prioridad, motivo);
    }

}