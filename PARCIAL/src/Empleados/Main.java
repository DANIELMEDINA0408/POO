package Empleados;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear un arreglo de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Llenar el arreglo con al menos 10 datos diferentes
        empleados.add(new EmpleadoAsalariado("Juan", 3000, 200));
        empleados.add(new EmpleadoAsalariado("María", 2500, 150));
        empleados.add(new EmpleadoPorHoras("Carlos", 0, 160, 10));
        empleados.add(new EmpleadoPorHoras("Laura", 0, 180, 12));
        empleados.add(new EmpleadoAsalariado("Pedro", 2800, 180));
        empleados.add(new EmpleadoPorHoras("Ana", 0, 140, 11));
        empleados.add(new EmpleadoAsalariado("Sofía", 2600, 160));
        empleados.add(new EmpleadoPorHoras("Diego", 0, 150, 9));
        empleados.add(new EmpleadoAsalariado("Luis", 3200, 220));
        empleados.add(new EmpleadoPorHoras("Elena", 0, 170, 13));

        // Obtener Empleados por horas
        System.out.println("Empleados por horas:");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPorHoras) {
                System.out.println("Nombre: " + empleado.getNombre() + ", Salario: " + empleado.calcularSalario());
            }
        }

        // Obtener Empleados Asalariados
        System.out.println("\nEmpleados asalariados:");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoAsalariado) {
                System.out.println("Nombre: " + empleado.getNombre() + ", Salario: " + empleado.calcularSalario());
            }
        }

        // Modificar el nombre o salario de un empleado
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals("Juan")) {
                empleado.setNombre("Javier");
                empleado.setSalarioBase(3200);
            }
        }

        // Obtener Empleados por horas (para verificar que se modificó)
        System.out.println("\nEmpleados por horas (después de modificar):");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPorHoras) {
                System.out.println("Nombre: " + empleado.getNombre() + ", Salario: " + empleado.calcularSalario());
            }
        }

        // Obtener un empleado específico (por nombre)
        String nombreBuscado = "Sofía";
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombreBuscado)) {
                System.out.println("\nEmpleado encontrado: " + empleado.getNombre() + ", Salario: " + empleado.calcularSalario());
            }
        }
    }
}
