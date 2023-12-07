package com.mycompany.losnegativos;
public class Multa {
    private final int diasRetraso;
    private double montoMulta;
    private Lector lector;
    private Prestamo prestamo;

    public Multa(int diasRetraso, double montoMulta, Lector lector, Prestamo prestamo) {
        this.diasRetraso = diasRetraso;
        this.montoMulta = montoMulta;
        this.lector = lector;
        this.prestamo = prestamo;
    }

 
    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public double calcularMulta() {
        
        this.montoMulta = this.diasRetraso * 5.0; // asumimos que la multa es de 5.0 por día de retraso
        return this.montoMulta;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
    
}
