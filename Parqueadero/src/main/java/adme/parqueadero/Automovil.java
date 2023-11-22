package adme.parqueadero;
/**
 *
 * @author Andrés Daniel Medina Erazo (104623010363)
 */
public class Automovil extends Vehiculo{
      private int numeroPuertas;
    // Constructores, getters y setters

    // Otros métodos específicos para automóviles

    public Automovil(int numeroPuertas, String marca, String modelo, String placa, int horaEntrada) {
        super(marca, modelo, placa, horaEntrada);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }


}