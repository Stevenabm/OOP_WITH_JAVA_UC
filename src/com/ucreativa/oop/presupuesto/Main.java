package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.entidades.Movimiento;
import com.ucreativa.oop.presupuesto.entidades.RegistroMovimientos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
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

        System.out.println("Sistema Registro de Movimientos");
        Scanner consola = new Scanner(System.in);

        RegistroMovimientos registro = new RegistroMovimientos();

    boolean siga = true;
    while(siga){
        System.out.println("Digite el nombre de su movimiento:");
        String nombre = consola.nextLine();

        System.out.println("Digite la moneda:");
        String moneda = consola.nextLine();

        System.out.println("Digite la categoria de su movimiento:");
        String categoria = consola.nextLine();

        System.out.println("Digite el monto de su movimiento:");
        String montoStr = consola.nextLine();
        int monto = Integer.parseInt(montoStr);

        Movimiento nuevoMovimiento;

        System.out.println("Indique si es un Gasto (S)");
        if (consola.nextLine().equals("s")) {
            nuevoMovimiento = new Gasto(nombre,moneda,categoria,monto);
        } else {
            System.out.println("Digite la periodicidad:");
            String periodicidad = consola.nextLine();
            nuevoMovimiento = new Ingreso(nombre,moneda,categoria,monto,periodicidad);
        }

        registro.addMovimiento(nuevoMovimiento);

        System.out.println("Todos los Movimientos:");
        for (Movimiento g : registro.getMovimiento()){
            System.out.println(g.getNombre());
        }

        System.out.println("Solo Gastos:");
        for (Movimiento g : registro.getGastos()){
            System.out.println(g.getNombre());
        }

        System.out.println("Quiere seguir?('s')");
        siga = consola.nextLine().equals("s");
    }


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
