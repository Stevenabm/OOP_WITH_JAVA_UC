package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.RegistroGastos;

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

        System.out.println("Sistema Registro de Gastos");
        Scanner consola = new Scanner(System.in);

        RegistroGastos registro = new RegistroGastos();

    boolean siga = true;
    while(siga){
        System.out.println("Digite el nombre de su gasto:");
        String nombre = consola.nextLine();

        System.out.println("Digite la moneda:");
        String moneda = consola.nextLine();

        System.out.println("Digite la categoria de su gasto:");
        String categoria = consola.nextLine();

        System.out.println("Digite el monto de su gasto:");
        String montoStr = consola.nextLine();
        int monto = Integer.parseInt(montoStr);

        Gasto nuevoGasto = new Gasto(nombre,moneda,categoria,monto);

        registro.addGastos(nuevoGasto);

        for (Gasto g : registro.getGastos()){
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
