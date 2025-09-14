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
    public void setActualizar_Salario(int porcentaje){
        if(this.salario != 0){
            this.salario = this.salario * (porcentaje / 100.0 + 1);
        }else{
            this.salario = 1 * (porcentaje / 100.0 + 1);
        }
    }
    //Metodos 2
    public void setActualizar_Salario(double monto_fijo){
        if(monto_fijo > 0){
            this.salario += monto_fijo;
        }else{
            this.salario = this.salario;
        }
    }
    
    public void setSalario(double salario){
        if(salario > 0){
            this.salario = salario;
        }else{
            this.salario = 0.0;
        }
    }
    //Metodo statico
    public static int gettotal_empleados(){
        return Empleado.total_empleados;
    }

    @Override
    public String toString() {
        return "Empleado{" + "\nid=" + id + "\nnombre = " + nombre + "\npuesto = " + puesto + "\nsalario = " + salario+'}';
    }
    
    
}
