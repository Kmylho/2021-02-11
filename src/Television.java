public class Television extends Electrodomestico{
    //Declaracion de atributos
    protected int pulgadas;
    protected String tdt;

    //Constructor
    public Television(String procedencia, String consumo, int pulgadas, String tdt, int precio){
        super(procedencia,consumo,precio);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    };

    public void compra() {
        System.out.println("compro television procedencia: "+getProcedencia()+", Consumo: "+getConsumo()+", Pulgadas: "+pulgadas+", TDT: "+tdt+"\n con el valor total de: "+getPrecio());
        System.out.println("Gracias por la compra vuelva pronto");
    }
}
