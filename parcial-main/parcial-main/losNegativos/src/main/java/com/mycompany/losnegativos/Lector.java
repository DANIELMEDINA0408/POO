package com.mycompany.losnegativos;
public class Lector {
    public int numSocio;
    public String nombre;
    public String apellido;
    public String direccion;
    public Copia[] copias;
    public Multa multa;
    
    public Lector(int numSocio, String nombre, String apellido, String direccion) {
        this.numSocio = numSocio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.copias = new Copia[3];
    }
      public void comprobarMultaPendiente() {
        if (this.multa != null) {
            double montoMulta = this.multa.calcularMulta();
            if (montoMulta > 0) {
                System.out.println("El lector " + this.nombre + " " + this.apellido + " tiene una multa pendiente de " + montoMulta);
            } else {
                System.out.println("El lector " + this.nombre + " " + this.apellido + " no tiene multas pendientes.");
            }
        }
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }

    public Multa getMulta() {
        return multa;
    }
  
}
