public class Nevera extends Electrodomestico{
    //Declaracion de atributos
    protected int litros;

    //Constructor
    public Nevera(String procedencia, String consumo, int litros, int precio){
        super(procedencia,consumo,precio);
        this.litros = litros;
    };

    public void compra() {
        System.out.println("compro nevera procedencia: "+getProcedencia()+", Consumo: "+getConsumo()+", Litros: "+litros+ "\n con el valor total de: "+getPrecio());
        System.out.println("Gracias por la compra vuelva pronto");
    }

}
