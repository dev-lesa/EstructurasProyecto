/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colahospital;

/**
 *
 * @author Luis
 */
import java.util.PriorityQueue;
import java.util.Queue;

public class SistemaHospital {
    private Queue<Paciente> colaPacientes;

    public SistemaHospital() {
        colaPacientes = new PriorityQueue<>();
    }

    public void agregarPaciente(Paciente paciente) {
        colaPacientes.add(paciente);
    }

    public Paciente atenderPaciente() {
        return colaPacientes.poll();
    }

    public void mostrarCola() {
        if (colaPacientes.isEmpty()) {
            System.out.println("\nno hay pacientes en espera");
            return;
        }
        
        System.out.println("\n--- PACIENTES ESPERANDO---");
        int contador = 1;
        for (Paciente paciente : colaPacientes) {
            System.out.println(contador++ + ". " + paciente);
        }
    }

    public boolean hayPacientes() {
        return !colaPacientes.isEmpty();
    }
}