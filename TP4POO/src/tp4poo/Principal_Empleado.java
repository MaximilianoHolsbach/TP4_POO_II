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
        
        
        System.out.println("Creado con auto id y salario por defecto");
        System.out.println(empleado1);
        System.out.println("Creado con auto id y salario por defecto");
        System.out.println(empleado2);
        System.out.println("Creado con id especificado y salario especificado");
        System.out.println(empleado3);
        System.out.println("Creado con id especificado y salario especificado");
        System.out.println(empleado4);
        
        //Se carga concepto sueldo de empleado numero 1 
        empleado1.setSalario(15000.0);
        System.out.println("Se carga el concepto salario");
        System.out.println(empleado1);
        System.out.println("");
        
        //Se actualiza por porcentaje el sueldo de empleado numero 3 
        System.out.println("Se actualiza el concepto salario por porcentaje");
        empleado3.setActualizar_Salario(10);
        System.out.println(empleado3);
        System.out.println("");
        
        //Se actualiza por monto fijo el sueldo de empleado numero 4
        System.out.println("Se actualiza el concepto salario por monto fijo");
        empleado4.setActualizar_Salario(1000.0);
        System.out.println(empleado4);
        System.out.println("");
        //Se actualiza por monto fijo el sueldo de empleado numero 4
        System.out.println("El total de empleados es: "+Empleado.gettotal_empleados());
    }
}
