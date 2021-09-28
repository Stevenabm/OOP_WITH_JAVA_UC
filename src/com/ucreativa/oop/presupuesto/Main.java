package com.ucreativa.oop.presupuesto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Mi nuevo main");

        Gasto gastoLuz = new Gasto();
        gastoLuz.nombre = "Luz";
        gastoLuz.moneda = "Colones";
        gastoLuz.monto = 22000;
        //System.out.println(gastoLuz.nombre + " -> " + gastoLuz.monto);

        Gasto gastoInternet = new Gasto();
        gastoInternet.nombre = "Internet";
        gastoInternet.moneda = "Colones";
        gastoInternet.monto = 30000;

        RegistroGastos registro = new RegistroGastos();
        registro.gastos = new ArrayList<>();
        registro.gastos.add(gastoLuz);
        registro.gastos.add(gastoInternet);

        for (int i = 0; i < registro.gastos.size(); i++) {
            System.out.println(registro.gastos.get(i).nombre);
        }
    }
}