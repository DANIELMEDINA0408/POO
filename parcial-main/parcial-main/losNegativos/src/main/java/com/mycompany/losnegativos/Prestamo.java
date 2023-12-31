/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.losnegativos;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author IngSis
 */
public class Prestamo {
    public Date fechaInicio;
    public Date fechaFin;
    public Multa multa;
    

    public Prestamo(Date fechaInicio, Date fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
public void generarMulta() {
    Date hoy = new Date();
    if (this.fechaFin != null && hoy.after(this.fechaFin)) {
        this.multa = new Multa(0, 0.0, null, null); // asegúrate de que Multa tiene un constructor que acepta estos parámetros
        System.out.println("Se ha generado una multa por retraso en la devolución del libro.");
    } else if (this.fechaFin == null) {
        System.out.println("Error: fechaFin es null");
    }
}

       public Date calcularFechaFin() {
        Calendar c = Calendar.getInstance();
        c.setTime(this.fechaInicio);
        c.add(Calendar.DATE, 14);  // número de días a añadir, o restar en caso de días<0
        this.fechaFin = c.getTime();
        return this.fechaFin;
    }
}