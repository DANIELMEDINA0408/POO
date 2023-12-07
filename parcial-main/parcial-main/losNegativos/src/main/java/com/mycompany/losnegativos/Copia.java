package com.mycompany.losnegativos;
public class Copia {
  public String identificador;
  public String estado;
  public Libro original;
  public Lector lector;
  public Multa multa;
  
    public Copia(String identificador, String estado, Libro original) {
        this.identificador = identificador;
        this.estado = estado;
        this.original = original;
    }
   
   
    public void prestar(){
    this.estado= "prestado";
        System.out.println("El libro se ha prestado");
    }
    public void devolver(){
    this.estado= "disponible";
        System.out.println("El libro esta disponible");
    }
    
}
