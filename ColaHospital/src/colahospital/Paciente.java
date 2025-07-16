/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colahospital;

/**
 *
 * @author Luis
 */
public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private int edad;
    private int prioridad;
    private String motivo;

    public Paciente(String nombre, int edad, int prioridad, String motivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.prioridad = prioridad;
        this.motivo = motivo;
    }

    @Override
    public int compareTo(Paciente otro) {
        return Integer.compare(this.prioridad, otro.prioridad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPrioridadTexto() {
        return prioridad == 1 ? "Grave" : "Normal";
    }

    public String getMotivo() {
        return motivo;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años) - Prioridad: " + getPrioridadTexto() + " Motivo: " + motivo;
    }
}