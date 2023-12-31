package adme.parqueadero;
/**
 *
 * @author Andrés Daniel Medina Erazo (104623010363)
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    int horaSalida = -1;
    int horaIngreso, ganancias;
    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }
    public void setHoraEntrada(int horaEntrada){
        this.horaIngreso = horaEntrada;
    }

    public void uptDineroGenerado() {
        if(horaSalida > horaIngreso)
            ganancias = (horaSalida - horaIngreso) * 15000;
        else
            ganancias = ((24 - horaIngreso) + horaSalida) * 15000;
    }

    public Vehiculo(String marca, String modelo, String placa, int horaEntrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.horaIngreso = horaEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}