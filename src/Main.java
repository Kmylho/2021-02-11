import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Menu de compras \n 1 para televisor, 2 para nevera y 3 para salir");
        Scanner var = new Scanner(System.in);
        //Variable de salida
        boolean salir= false;
        int entrada1;
        entrada1 = var.nextInt();
        int nacional =250000;
        String nacional2 = "Nacional";
        int importado=350000;
        String importado2 = "Importado";
        int consumoA = 450000;
        int consumoB = 350000;
        int consumoC = 250000;
        int tdt = 250000;
        String TDTSI = "SI";
        String TDTNO = "NO";

        while(!salir){
            try{
                switch (entrada1){
                    //menu television
                    case 1:
                        int entrada2;
                        System.out.println("Ingrese la procedencia \n 1 para Nacional, 2 para Importado o 3 para salir");
                        Scanner noi = new Scanner(System.in);
                        entrada2 = noi.nextInt();

                        switch (entrada2){
                            //Menu de television nacional
                            case 1:
                                String entrada3;
                                System.out.println("Ingrese el consumo  \n , ya sea a , b o c ");
                                Scanner abc1 = new Scanner(System.in);
                                entrada3 = abc1.next();

                                switch (entrada3){
                                    case ("a"):
                                        int entrada4;
                                        System.out.println("ingrese las pulgadas de la television");
                                        Scanner a1 = new Scanner(System.in);
                                        entrada4 = a1.nextInt();
                                        if (entrada4<=39){
                                            int entrada5;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner a2 = new Scanner(System.in);
                                            entrada5 = a2.nextInt();
                                            if (entrada5 == 1){
                                                int precio=nacional+consumoA+tdt;
                                                Television television= new Television(nacional2,"A",entrada4,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada5 == 2){
                                                int precio=nacional+consumoA;
                                                Television television= new Television(nacional2,"A",entrada4,TDTNO,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }else if(entrada4>=40){
                                            int entrada6;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner a3 = new Scanner(System.in);
                                            entrada6 = a3.nextInt();
                                            if (entrada6 == 1){
                                                double valorTemporal1 = (nacional+consumoA)+((nacional+consumoA)*0.3);
                                                int precio=(int)valorTemporal1+tdt;
                                                Television television= new Television(nacional2,"A",entrada4,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada6 == 2){
                                                double valorTemporal2 = (nacional+consumoA)+((nacional+consumoA)*0.3);
                                                int precio=(int)valorTemporal2;
                                                Television television= new Television(nacional2,"A",entrada4,TDTSI,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }
                                        break;
                                    case ("b"):
                                        int entrada7;
                                        System.out.println("ingrese las pulgadas de la television");
                                        Scanner b1 = new Scanner(System.in);
                                        entrada7 = b1.nextInt();
                                        if (entrada7<=39){
                                            int entrada8;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner b2 = new Scanner(System.in);
                                            entrada8 = b2.nextInt();
                                            if (entrada8 == 1){
                                                int precio=nacional+consumoB+tdt;
                                                Television television= new Television(nacional2,"B",entrada7,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada8 == 2){
                                                int precio=nacional+consumoB;
                                                Television television= new Television(nacional2,"B",entrada7,TDTNO,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }else if(entrada7>=40){
                                            int entrada9;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner b3 = new Scanner(System.in);
                                            entrada9 = b3.nextInt();
                                            if (entrada9 == 1){
                                                double valorTemporal = (nacional+consumoB)+((nacional+consumoB)*0.3);
                                                int precio=(int)valorTemporal+tdt;
                                                Television television= new Television(nacional2,"B",entrada7,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada9 == 2){
                                                double valorTemporal = (nacional+consumoB)+((nacional+consumoB)*0.3);
                                                int precio=(int)valorTemporal;
                                                Television television= new Television(nacional2,"B",entrada7,TDTSI,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }
                                        break;
                                    case ("c"):
                                        int entrada10;
                                        System.out.println("ingrese las pulgadas de la television");
                                        Scanner C1 = new Scanner(System.in);
                                        entrada10 = C1.nextInt();
                                        if (entrada10<=39){
                                            int entrada11;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner C2 = new Scanner(System.in);
                                            entrada11 = C2.nextInt();
                                            if (entrada11 == 1){
                                                int precio=nacional+consumoC+tdt;
                                                Television television= new Television(nacional2,"C",entrada10,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada11 == 2){
                                                int precio=nacional+consumoC;
                                                Television television= new Television(nacional2,"C",entrada10,TDTNO,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }else if(entrada10>=40){
                                            int entrada12;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner C3 = new Scanner(System.in);
                                            entrada12 = C3.nextInt();
                                            if (entrada12 == 1){
                                                double valorTemporal = (nacional+consumoC)+((nacional+consumoC)*0.3);
                                                int precio=(int)valorTemporal+tdt;
                                                Television television= new Television(nacional2,"C",entrada10,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada12 == 2){
                                                double valorTemporal = (nacional+consumoA)+((nacional+consumoA)*0.3);
                                                int precio=(int)valorTemporal;
                                                Television television= new Television(nacional2,"C",entrada10,TDTSI,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                };
                                break;
                            //Menu de television importada
                            case 2:
                                String entrada13;
                                System.out.println("Ingrese el consumo  \n , ya sea a , b o c ");
                                Scanner abc2 = new Scanner(System.in);
                                entrada13 = abc2.next();

                                switch (entrada13){
                                    case ("a"):
                                        int entrada14;
                                        System.out.println("ingrese las pulgadas de la television");
                                        Scanner a1 = new Scanner(System.in);
                                        entrada14 = a1.nextInt();
                                        if (entrada14<=39){
                                            int entrada15;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner a2 = new Scanner(System.in);
                                            entrada15 = a2.nextInt();
                                            if (entrada15 == 1){
                                                int precio=importado+consumoA+tdt;
                                                Television television= new Television(importado2,"A",entrada14,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada15 == 2){
                                                int precio=importado+consumoA;
                                                Television television= new Television(importado2,"A",entrada14,TDTNO,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }else if(entrada14>=40){
                                            int entrada16;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner a3 = new Scanner(System.in);
                                            entrada16 = a3.nextInt();
                                            if (entrada16 == 1){
                                                double valorTemporal1 = (importado+consumoA)+((importado+consumoA)*0.3);
                                                int precio=(int)valorTemporal1+tdt;
                                                Television television= new Television(importado2,"A",entrada14,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada16 == 2){
                                                double valorTemporal2 = (importado+consumoA)+((importado+consumoA)*0.3);
                                                int precio=(int)valorTemporal2;
                                                Television television= new Television(importado2,"A",entrada14,TDTSI,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }
                                        break;
                                    case ("b"):
                                        int entrada17;
                                        System.out.println("ingrese las pulgadas de la television");
                                        Scanner b1 = new Scanner(System.in);
                                        entrada17 = b1.nextInt();
                                        if (entrada17<=39){
                                            int entrada18;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner b2 = new Scanner(System.in);
                                            entrada18 = b2.nextInt();
                                            if (entrada18 == 1){
                                                int precio=importado+consumoB+tdt;
                                                Television television= new Television(importado2,"B",entrada17,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada18 == 2){
                                                int precio=importado+consumoB;
                                                Television television= new Television(importado2,"B",entrada17,TDTNO,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }else if(entrada17>=40){
                                            int entrada19;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner b3 = new Scanner(System.in);
                                            entrada19 = b3.nextInt();
                                            if (entrada19 == 1){
                                                double valorTemporal = (importado+consumoB)+((importado+consumoB)*0.3);
                                                int precio=(int)valorTemporal+tdt;
                                                Television television= new Television(importado2,"B",entrada17,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada19 == 2){
                                                double valorTemporal = (importado+consumoB)+((importado+consumoB)*0.3);
                                                int precio=(int)valorTemporal;
                                                Television television= new Television(importado2,"B",entrada17,TDTSI,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }
                                        break;
                                    case ("c"):
                                        int entrada20;
                                        System.out.println("ingrese las pulgadas de la television");
                                        Scanner C1 = new Scanner(System.in);
                                        entrada20 = C1.nextInt();
                                        if (entrada20<=39){
                                            int entrada21;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner C2 = new Scanner(System.in);
                                            entrada21 = C2.nextInt();
                                            if (entrada21 == 1){
                                                int precio=importado+consumoC+tdt;
                                                Television television= new Television(importado2,"C",entrada20,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada21 == 2){
                                                int precio=importado+consumoC;
                                                Television television= new Television(importado2,"C",entrada20,TDTNO,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }else if(entrada20>=40){
                                            int entrada22;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner C3 = new Scanner(System.in);
                                            entrada22 = C3.nextInt();
                                            if (entrada22 == 1){
                                                double valorTemporal = (importado+consumoC)+((importado+consumoC)*0.3);
                                                int precio=(int)valorTemporal+tdt;
                                                Television television= new Television(importado2,"C",entrada20,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada22 == 2){
                                                double valorTemporal = (importado+consumoA)+((importado+consumoA)*0.3);
                                                int precio=(int)valorTemporal;
                                                Television television= new Television(importado2,"C",entrada20,TDTSI,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                };
                                break;
                            case 3:
                                System.out.println("Gracias vuelva pronto");
                                salir=true;
                                break;
                            default:
                                System.out.println("El dato fue mal ingresado");
                                System.out.println("Vuelva a intentar");
                                salir = true;
                                break;
                        };
                        break;
                    //menu nevera
                    case 2:
                        int entrada23;
                        System.out.println("Ingrese la procedencia \n 1 para Nacional, 2 para Importado o 3 para salir");
                        Scanner noi2 = new Scanner(System.in);
                        entrada23 = noi2.nextInt();

                        switch (entrada23){
                            //Menu de nevera nacional
                            case 1:
                                String entrada24;
                                System.out.println("Ingrese el consumo  \n , ya sea a , b o c ");
                                Scanner abc1 = new Scanner(System.in);
                                entrada24 = abc1.next();

                                switch (entrada24){
                                    case ("a"):
                                        int litros;
                                        System.out.println("ingrese los litros de la nevera");
                                        Scanner a1 = new Scanner(System.in);
                                        litros = a1.nextInt();
                                        if (litros<=120){
                                            int precio=nacional+consumoA;
                                            Nevera nevera = new Nevera(nacional2,"A",litros,precio);
                                            nevera.compra();
                                        }else if(litros>=121){
                                            double valorTemporal = (nacional+consumoA)+(((litros-120)/10)*0.05);
                                            int precio=(int)valorTemporal;
                                            int precio=nacional+consumoA+;
                                            Nevera nevera = new Nevera(nacional2,"A",litros,precio);
                                            nevera.compra();
                                        }
                                        break;
                                    case ("b"):
                                        int entrada7;
                                        System.out.println("ingrese las pulgadas de la television");
                                        Scanner b1 = new Scanner(System.in);
                                        entrada7 = b1.nextInt();
                                        if (entrada7<=39){
                                            int entrada8;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner b2 = new Scanner(System.in);
                                            entrada8 = b2.nextInt();
                                            if (entrada8 == 1){
                                                int precio=nacional+consumoB+tdt;
                                                Television television= new Television(nacional2,"B",entrada7,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada8 == 2){
                                                int precio=nacional+consumoB;
                                                Television television= new Television(nacional2,"B",entrada7,TDTNO,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }else if(entrada7>=40){
                                            int entrada9;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner b3 = new Scanner(System.in);
                                            entrada9 = b3.nextInt();
                                            if (entrada9 == 1){
                                                double valorTemporal = (nacional+consumoB)+((nacional+consumoB)*0.3);
                                                int precio=(int)valorTemporal+tdt;
                                                Television television= new Television(nacional2,"B",entrada7,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada9 == 2){
                                                double valorTemporal = (nacional+consumoB)+((nacional+consumoB)*0.3);
                                                int precio=(int)valorTemporal;
                                                Television television= new Television(nacional2,"B",entrada7,TDTSI,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }
                                        break;
                                    case ("c"):
                                        int entrada10;
                                        System.out.println("ingrese las pulgadas de la television");
                                        Scanner C1 = new Scanner(System.in);
                                        entrada10 = C1.nextInt();
                                        if (entrada10<=39){
                                            int entrada11;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner C2 = new Scanner(System.in);
                                            entrada11 = C2.nextInt();
                                            if (entrada11 == 1){
                                                int precio=nacional+consumoC+tdt;
                                                Television television= new Television(nacional2,"C",entrada10,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada11 == 2){
                                                int precio=nacional+consumoC;
                                                Television television= new Television(nacional2,"C",entrada10,TDTNO,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }else if(entrada10>=40){
                                            int entrada12;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner C3 = new Scanner(System.in);
                                            entrada12 = C3.nextInt();
                                            if (entrada12 == 1){
                                                double valorTemporal = (nacional+consumoC)+((nacional+consumoC)*0.3);
                                                int precio=(int)valorTemporal+tdt;
                                                Television television= new Television(nacional2,"C",entrada10,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada12 == 2){
                                                double valorTemporal = (nacional+consumoA)+((nacional+consumoA)*0.3);
                                                int precio=(int)valorTemporal;
                                                Television television= new Television(nacional2,"C",entrada10,TDTSI,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                };
                                break;
                            //Menu de nevera importada
                            case 2:
                                String entrada13;
                                System.out.println("Ingrese el consumo  \n , ya sea a , b o c ");
                                Scanner abc2 = new Scanner(System.in);
                                entrada13 = abc2.next();

                                switch (entrada13){
                                    case ("a"):
                                        int entrada14;
                                        System.out.println("ingrese las pulgadas de la television");
                                        Scanner a1 = new Scanner(System.in);
                                        entrada14 = a1.nextInt();
                                        if (entrada14<=39){
                                            int entrada15;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner a2 = new Scanner(System.in);
                                            entrada15 = a2.nextInt();
                                            if (entrada15 == 1){
                                                int precio=importado+consumoA+tdt;
                                                Television television= new Television(importado2,"A",entrada14,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada15 == 2){
                                                int precio=importado+consumoA;
                                                Television television= new Television(importado2,"A",entrada14,TDTNO,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }else if(entrada14>=40){
                                            int entrada16;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner a3 = new Scanner(System.in);
                                            entrada16 = a3.nextInt();
                                            if (entrada16 == 1){
                                                double valorTemporal1 = (importado+consumoA)+((importado+consumoA)*0.3);
                                                int precio=(int)valorTemporal1+tdt;
                                                Television television= new Television(importado2,"A",entrada14,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada16 == 2){
                                                double valorTemporal2 = (importado+consumoA)+((importado+consumoA)*0.3);
                                                int precio=(int)valorTemporal2;
                                                Television television= new Television(importado2,"A",entrada14,TDTSI,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }
                                        break;
                                    case ("b"):
                                        int entrada17;
                                        System.out.println("ingrese las pulgadas de la television");
                                        Scanner b1 = new Scanner(System.in);
                                        entrada17 = b1.nextInt();
                                        if (entrada17<=39){
                                            int entrada18;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner b2 = new Scanner(System.in);
                                            entrada18 = b2.nextInt();
                                            if (entrada18 == 1){
                                                int precio=importado+consumoB+tdt;
                                                Television television= new Television(importado2,"B",entrada17,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada18 == 2){
                                                int precio=importado+consumoB;
                                                Television television= new Television(importado2,"B",entrada17,TDTNO,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }else if(entrada17>=40){
                                            int entrada19;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner b3 = new Scanner(System.in);
                                            entrada19 = b3.nextInt();
                                            if (entrada19 == 1){
                                                double valorTemporal = (importado+consumoB)+((importado+consumoB)*0.3);
                                                int precio=(int)valorTemporal+tdt;
                                                Television television= new Television(importado2,"B",entrada17,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada19 == 2){
                                                double valorTemporal = (importado+consumoB)+((importado+consumoB)*0.3);
                                                int precio=(int)valorTemporal;
                                                Television television= new Television(importado2,"B",entrada17,TDTSI,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }
                                        break;
                                    case ("c"):
                                        int entrada20;
                                        System.out.println("ingrese las pulgadas de la television");
                                        Scanner C1 = new Scanner(System.in);
                                        entrada20 = C1.nextInt();
                                        if (entrada20<=39){
                                            int entrada21;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner C2 = new Scanner(System.in);
                                            entrada21 = C2.nextInt();
                                            if (entrada21 == 1){
                                                int precio=importado+consumoC+tdt;
                                                Television television= new Television(importado2,"C",entrada20,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada21 == 2){
                                                int precio=importado+consumoC;
                                                Television television= new Television(importado2,"C",entrada20,TDTNO,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }else if(entrada20>=40){
                                            int entrada22;
                                            System.out.println("La television cuenta con TDT? \n ingrese 1 para si y 2 para no");
                                            Scanner C3 = new Scanner(System.in);
                                            entrada22 = C3.nextInt();
                                            if (entrada22 == 1){
                                                double valorTemporal = (importado+consumoC)+((importado+consumoC)*0.3);
                                                int precio=(int)valorTemporal+tdt;
                                                Television television= new Television(importado2,"C",entrada20,TDTSI,precio);
                                                television.compra();
                                            }else if(entrada22 == 2){
                                                double valorTemporal = (importado+consumoA)+((importado+consumoA)*0.3);
                                                int precio=(int)valorTemporal;
                                                Television television= new Television(importado2,"C",entrada20,TDTSI,precio);
                                                television.compra();
                                            }else{
                                                System.out.println("");
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                };
                                break;
                            case 3:
                                System.out.println("Gracias vuelva pronto");
                                salir=true;
                                break;
                            default:
                                System.out.println("El dato fue mal ingresado");
                                System.out.println("Vuelva a intentar");
                                salir = true;
                                break;
                        };
                        break;
                    case 3:
                        System.out.println("Gracias vuelva pronto");
                        salir=true;
                        break;
                    default:
                        System.out.println("El dato fue mal ingresado");
                        System.out.println("Vuelva a intentar");
                        salir = true;
                        break;
                };
            }catch(InputMismatchException e) {
                System.out.println("Se produjo el siguiente error :"+e);
            };
        }




    }
}
