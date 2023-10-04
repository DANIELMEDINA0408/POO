package Empleados;

public class EmpleadoAsalariado extends Empleados {
        private double deducciones;

    public EmpleadoAsalariado(double deducciones, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.deducciones = deducciones;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }
        @Override
    public String getNombre() {
        return nombre;
    }
        @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

         @Override
    public double getSalarioBase() {
        return salarioBase;
    }

        @Override
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
        

    
    public double calcularSalario(){
        return this.salarioBase-this.salarioBase;
    }

    
}

