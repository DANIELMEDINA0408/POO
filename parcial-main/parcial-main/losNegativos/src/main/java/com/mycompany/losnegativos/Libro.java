
package com.mycompany.losnegativos;
import java.util.List;

public class Libro {
    
    public String nombre;
    public String editorial;
    public String tipo;
    public String año;
   public List<Autor> escrito;
   public List<Copia> copias;

    public Libro(String nombre, String editorial, String tipo, String año, List<Autor> escrito, List<Copia> copias) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.tipo = tipo;
        this.año = año;
        this.escrito = escrito;
        this.copias = copias;
    }
 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public void setEscrito(List<Autor> escrito) {
        this.escrito = escrito;
    }

    public void setCopias(List<Copia> copias) {
        this.copias = copias;
    }
    
}
