public class Electrodomestico {
    //Declaracion de atributos
    protected String procedencia;
    protected String consumo;
    protected int precio;

    //Constructor
    public Electrodomestico(String procedencia, String consumo, int precio) {
        this.procedencia = procedencia;
        this.consumo = consumo;
        this.precio = precio;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
