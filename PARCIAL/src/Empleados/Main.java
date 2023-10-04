package Empleados;

public class Main {
    
    public static void main(String[] args) {
    
    EmpleadoAsalariado[] empleadoAsalariado = new EmpleadoAsalariado [5];
    empleadoAsalariado[0].setSalarioBase(1000);
    empleadoAsalariado[0].setDeducciones(200);
    empleadoAsalariado[0].setNombre("Ikan");
    empleadoAsalariado[0].calcularSalario();
    
    empleadoAsalariado[1].setSalarioBase(1500);
    empleadoAsalariado[1].setDeducciones(300);
    empleadoAsalariado[1].setNombre("Gerundio");
    empleadoAsalariado[1].calcularSalario();
    
    empleadoAsalariado[2].setSalarioBase(1000);
    empleadoAsalariado[2].setDeducciones(300);
    empleadoAsalariado[2].setNombre("Esteban");
    empleadoAsalariado[2].calcularSalario();
    
    empleadoAsalariado[3].setSalarioBase(1500);
    empleadoAsalariado[3].setDeducciones(200);
    empleadoAsalariado[3].setNombre("Jordi");
    empleadoAsalariado[3].calcularSalario();
    
    empleadoAsalariado[4].setSalarioBase(1000);
    empleadoAsalariado[4].setDeducciones(200);
    empleadoAsalariado[4].setNombre("Wild");
    empleadoAsalariado[4].calcularSalario();

    
    EmpleadoPorHoras[] empleadoPorHoras = new EmpleadoPorHoras [5];
    empleadoPorHoras[0].setSalarioBase(0);
    empleadoPorHoras[0].setNombre("Iván");
    empleadoPorHoras[0].setTarifaPorHora(4.5);
    empleadoPorHoras[0].setHorasTrabajadas(8);
    empleadoPorHoras[0].calcularSalario();
    
    empleadoPorHoras[1].setSalarioBase(0);
    empleadoPorHoras[1].setNombre("Teo");
    empleadoPorHoras[1].setTarifaPorHora(4.5);
    empleadoPorHoras[1].setHorasTrabajadas(8);
    empleadoPorHoras[1].calcularSalario();
    
    empleadoPorHoras[2].setSalarioBase(0);
    empleadoPorHoras[2].setNombre("Francisco");
    empleadoPorHoras[2].setTarifaPorHora(3.5);
    empleadoPorHoras[2].setHorasTrabajadas(9);
    empleadoPorHoras[2].calcularSalario();
    
    empleadoPorHoras[3].setSalarioBase(0);
    empleadoPorHoras[3].setNombre("Jairo");
    empleadoPorHoras[3].setTarifaPorHora(4.5);
    empleadoPorHoras[3].setHorasTrabajadas(10);
    empleadoPorHoras[3].calcularSalario();
    
    empleadoPorHoras[4].setSalarioBase(0);
    empleadoPorHoras[4].setNombre("Felipe");
    empleadoPorHoras[4].setTarifaPorHora(5.5);
    empleadoPorHoras[4].setHorasTrabajadas(6);
    empleadoPorHoras[4].calcularSalario();
    
       
    
        System.out.println("Nombre: " + empleadoAsalariado[0].getNombre());
        System.out.println("Salario Base: " + empleadoAsalariado[0].getSalarioBase());
        System.out.println("Deducciones: " + empleadoAsalariado[0].getDeducciones());
        System.out.println("Salario: " + empleadoAsalariado[0].calcularSalario());
        
        System.out.println("Nombre: " + empleadoAsalariado[1].getNombre());
        System.out.println("Salario Base: " + empleadoAsalariado[1].getSalarioBase());
        System.out.println("Deducciones: " + empleadoAsalariado[1].getDeducciones());
        System.out.println("Salario: " + empleadoAsalariado[1].calcularSalario());
       
        System.out.println("Nombre: " + empleadoAsalariado[2].getNombre());
        System.out.println("Salario Base: " + empleadoAsalariado[2].getSalarioBase());
        System.out.println("Deducciones: " + empleadoAsalariado[2].getDeducciones());
        System.out.println("Salario: " + empleadoAsalariado[2].calcularSalario());
        
        System.out.println("Nombre: " + empleadoAsalariado[3].getNombre());
        System.out.println("Salario Base: " + empleadoAsalariado[3].getSalarioBase());
        System.out.println("Deducciones: " + empleadoAsalariado[3].getDeducciones());
        System.out.println("Salario: " + empleadoAsalariado[3].calcularSalario());
        
        System.out.println("Nombre: " + empleadoAsalariado[4].getNombre());
        System.out.println("Salario Base: " + empleadoAsalariado[4].getSalarioBase());
        System.out.println("Deducciones: " + empleadoAsalariado[4].getDeducciones());
        System.out.println("Salario: " + empleadoAsalariado[4].calcularSalario());
        
        empleadoAsalariado[4].setSalarioBase(5000);
        empleadoAsalariado[4].setDeducciones(500);
        empleadoAsalariado[4].setNombre("El otro Wild");
        empleadoAsalariado[4].calcularSalario();
        
        System.out.println("Nombre: " + empleadoAsalariado[4].getNombre());
        System.out.println("Salario Base: " + empleadoAsalariado[4].getSalarioBase());
        System.out.println("Deducciones: " + empleadoAsalariado[4].getDeducciones());
        System.out.println("Salario: " + empleadoAsalariado[4].calcularSalario());
   
        System.out.println("Nombre: " + empleadoPorHoras[0].getNombre());
        System.out.println("Tarifa/Hora: " + empleadoPorHoras[0].getTarifaPorHora());
        System.out.println("Horas Trabajadas: " + empleadoPorHoras[0].getHorasTrabajadas());
        System.out.println("Salario" + empleadoPorHoras[0].calcularSalario());
        
        System.out.println("Nombre: " + empleadoPorHoras[1].getNombre());
        System.out.println("Tarifa/Hora: " + empleadoPorHoras[1].getTarifaPorHora());
        System.out.println("Horas Trabajadas: " + empleadoPorHoras[1].getHorasTrabajadas());
        System.out.println("Salario" + empleadoPorHoras[1].calcularSalario());
        
        System.out.println("Nombre: " + empleadoPorHoras[2].getNombre());
        System.out.println("Tarifa/Hora: " + empleadoPorHoras[2].getTarifaPorHora());
        System.out.println("Horas Trabajadas: " + empleadoPorHoras[2].getHorasTrabajadas());
        System.out.println("Salario" + empleadoPorHoras[2].calcularSalario());
        
        System.out.println("Nombre: " + empleadoPorHoras[3].getNombre());
        System.out.println("Tarifa/Hora: " + empleadoPorHoras[3].getTarifaPorHora());
        System.out.println("Horas Trabajadas: " + empleadoPorHoras[3].getHorasTrabajadas());
        System.out.println("Salario" + empleadoPorHoras[3].calcularSalario());
        
        System.out.println("Nombre: " + empleadoPorHoras[4].getNombre());
        System.out.println("Tarifa/Hora: " + empleadoPorHoras[4].getTarifaPorHora());
        System.out.println("Horas Trabajadas: " + empleadoPorHoras[4].getHorasTrabajadas());
        System.out.println("Salario" + empleadoPorHoras[4].calcularSalario());
        
        empleadoPorHoras[4].setSalarioBase(0);
        empleadoPorHoras[4].setNombre("Otro Nombre");
        empleadoPorHoras[4].setTarifaPorHora(3.5);
        empleadoPorHoras[4].setHorasTrabajadas(4);
        empleadoPorHoras[4].calcularSalario();
        
        System.out.println("Nombre: " + empleadoPorHoras[4].getNombre());
        System.out.println("Tarifa/Hora: " + empleadoPorHoras[4].getTarifaPorHora());
        System.out.println("Horas Trabajadas: " + empleadoPorHoras[4].getHorasTrabajadas());
        System.out.println("Salario" + empleadoPorHoras[4].calcularSalario());
        
        
        
       
        
        

    
    
  
        
        
    }
    
}
