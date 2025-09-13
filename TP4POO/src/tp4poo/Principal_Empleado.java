/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4poo;

/**
 *
 * @author Maxi
 */
public class Principal_Empleado {
    public static void main(String[]args){
        Empleado empleado1 = new Empleado("Lucía Fernández", "Analista de Datos");
        Empleado empleado2 = new Empleado("Carlos Méndez", "Desarrollador Backend");
        Empleado empleado3 = new Empleado(101, "Valentina Ríos", "Ingeniera de Datos", 850000.00);
        Empleado empleado4 = new Empleado(102, "Martín López", "Tester QA", 620000.00);

        System.out.println(empleado1);
        //System.out.println(empleado2);
        //System.out.println(empleado3);
        //System.out.println(empleado4);
        
        empleado1.setSalario(1000);
        System.out.println(empleado1);
        empleado1.actualizar_Salario(10.5);
        System.out.println(empleado1);
        
    }
}
