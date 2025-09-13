/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4poo;

/**
 *
 * @author Maxi
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int total_empleados = 0;
    private static int contador = 0;
    //Constructor 1
    public Empleado(int id, String nombre, String puesto, double salario) {
        Empleado.contador++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        setSalario(salario);
        Empleado.total_empleados = Empleado.contador;
    }
    //Constructor 2
    public Empleado(String nombre, String puesto) {
        Empleado.contador++;
        this.id = contador;
        this.nombre = nombre;
        this.puesto = puesto;
        Empleado.total_empleados = Empleado.contador;
    }
    
    //Metodos 1
    public void actualizar_Salario(){
        double aumento = this.salario * (10 / 100 + 1);
        setSalario(aumento);   
    }
    //Metodos 2
    public void actualizar_Salario(double aumento){
        this.salario += aumento;
        setSalario(this.salario);
    }
    
    public void setSalario(double salario){
        if(salario > 0){
            this.salario = salario;
        }else{
            this.salario = 0.0;
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "\nid=" + id + "\nnombre = " + nombre + "\npuesto = " + puesto + "\nsalario = " + salario + "\nTotal empleados = "+Empleado.total_empleados+'}';
    }
    
    
}
