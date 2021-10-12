package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.logicaNegocio.ImplementacionRegistro;
import com.ucreativa.oop.presupuesto.logicaNegocio.ImplementacionSuperDummy;
import com.ucreativa.oop.presupuesto.logicaNegocio.InterfaceRegistro;
import com.ucreativa.oop.presupuesto.ui.FrontEnd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        FrontEnd fe = new FrontEnd("Sistema Registro de Movimientos");
        fe.build();
        /*
        Gasto gastoLuz = new Gasto(
        "Luz",
        "Colones",
        "Servicios",
        22000);

        Gasto gastoInternet = new Gasto(
        "Internet",
        "Colones",
        "Servicios",
        30000);
*/

/*        System.out.println("Sistema Registro de Movimientos");
        Scanner consola = new Scanner(System.in);



    boolean siga = true;
    InterfaceRegistro registro;
    System.out.println("Que quiere usar? Fake? (F):");
    if (consola.nextLine().equals("F")){
        registro = new ImplementacionSuperDummy();
    } else
    {
        registro = new ImplementacionRegistro();
    }

    while(siga){
        System.out.println("Digite el nombre de su movimiento:");
        String nombre = consola.nextLine();

        System.out.println("Digite la moneda:");
        String moneda = consola.nextLine();

        System.out.println("Digite la categoria de su movimiento:");
        String categoria = consola.nextLine();

        System.out.println("Digite el monto de su movimiento:");
        String montoStr = consola.nextLine();

        System.out.println("Indique si es un Gasto (S)");
        if (consola.nextLine().equals("s")) {
            registro.addGasto(nombre,moneda,categoria,montoStr);
        } else {
            System.out.println("Digite la periodicidad:");
            String periodicidad = consola.nextLine();
            registro.addIngreso(nombre,moneda,categoria,montoStr,periodicidad);
        }

        System.out.println("Todos los Movimientos:");
        registro.getMovimiento();

        System.out.println("Solo Gastos:");
        registro.getGastos();

        System.out.println("Quiere seguir?('s')");
        siga = consola.nextLine().equals("s");
    }*/


        /*
        for (int i = 0; i < registro.getGastos().size(); i++) {
            System.out.println(registro.getGastos().get(i).getNombre());
        }
        */


    /* Lambda
        registro.getGastos().stream().map(Gasto::getNombre).forEach(System.out::println);

     */
    }
}
