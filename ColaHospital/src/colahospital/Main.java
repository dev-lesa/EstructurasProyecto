/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colahospital;

/**
 *
 * @author Luis
 */
public class Main {
    
    public static void main(String[] args) {
        SistemaHospital hospital = new SistemaHospital();
        
        while (true) {
            int opcion = InterfazUsuario.mostrarMenu();
            
            switch (opcion) {
                case 1:
                    Paciente nuevo = InterfazUsuario.pedirDatosPaciente();
                    hospital.agregarPaciente(nuevo);
                    System.out.println("\nPaciente añadido a la cola!");
                    break;
                    
                case 2:
                    if (hospital.hayPacientes()) {
                        Paciente atendido = hospital.atenderPaciente();
                        System.out.println("\n--- PACIENTE ATENDIDO ---");
                        System.out.println("Nombre: " + atendido.getNombre());
                        System.out.println("Edad: " + atendido.getEdad());
                        System.out.println("Prioridad: " + atendido.getPrioridadTexto());
                        System.out.println("Motivo: " + atendido.getMotivo());
                    } else {
                        System.out.println("\nNo hay pacientes en espera");
                    }
                    break;
                    
                case 3:
                    hospital.mostrarCola();
                    break;
                    
                case 4:
                    System.out.println("adios bro");
                    return;
                    
                default:
                    System.out.println("opcion no valida");
            }
        }
    }
}
