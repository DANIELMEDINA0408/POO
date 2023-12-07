package com.mycompany.losnegativos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import static spark.Spark.get;
import static spark.Spark.post;



public class LosNegativos {
    
    public static void main(String[] args) {
        // Crear objetos y relaciones aquí
       
         Multa multa = new Multa(0, 0.0, null, null);
        Autor autor = new Autor("Daniel", "Venezolano", new Date(), new ArrayList<>());
        Libro libro = new Libro("Hambre", "Panamericana", "Terror", "1802", null, null);
        
        Copia copia = new Copia("V564", "Disponible", libro);
        Lector lector = new Lector(1, "Nicolle", "Montaño", "Mi Casa");

        // Crear una fecha de inicio y una fecha de fin para el préstamo
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, -30);  // restar 30 días a la fecha actual para la fecha de inicio
        Date fechaInicio = c.getTime();
        c.add(Calendar.DATE, 14);  // añadir 14 días a la fecha de inicio para la fecha de fin
        Date fechaFin = c.getTime();

        Prestamo prestamo = new Prestamo(fechaInicio, fechaFin);

        // Añadir relaciones
        prestamo.multa = multa;
        autor.libros.add(libro);
        libro.escrito.add(autor);
        libro.copias.add(copia);
        prestamo.multa.setLector(lector);
      
     
     get("/libros", (req, res) -> {
    StringBuilder response = new StringBuilder();
    for (Libro libro1 : autor.libros) {
        response.append(libro1.toString()).append("\n");
    }
    return response.toString();
});

       post("/librosA", (req, res) -> {
            Libro nuevoLibro = new Libro("Nuevo libro", "Editorial", "Tipo", "Año", new ArrayList<>(), new ArrayList<>());
            autor.libros.add(nuevoLibro);
            return "Libro creado: " + nuevoLibro.nombre;
        });
        

        get("/prestar", (req, res) -> {
          
            copia.prestar();
            return "Libro prestado: " + copia.identificador;
        });

        get("/devolver", (req, res) -> {
          
            copia.devolver();
            return "Libro devuelto: " + copia.identificador;
        });

        get("/multa", (req, res) -> {
           
            prestamo.generarMulta();
            return "Multa generada: " + (prestamo.multa != null ? prestamo.multa.calcularMulta() : "No hay multa");
        });
    }
}

    
