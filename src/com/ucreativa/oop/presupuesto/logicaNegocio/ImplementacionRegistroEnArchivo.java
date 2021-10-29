package com.ucreativa.oop.presupuesto.logicaNegocio;


import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.entidades.Movimiento;

import java.io.*;
import java.util.stream.Collectors;

public class ImplementacionRegistroEnArchivo implements InterfaceRegistro{
    private final String FILE_PATH = "db.txt";

    @Override
    public void addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) {
        int monto = Integer.parseInt(montoStr);

        Ingreso ingreso = new Ingreso(nombre, moneda, categoria, monto, periodicidad);

        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(ingreso.getDetails()+"\n");
            writer.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void addGasto(String nombre, String moneda, String categoria, String montoStr) {
        int monto = Integer.parseInt(montoStr);

        Movimiento gasto = new Gasto(nombre, moneda, categoria, monto);

        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(gasto.getDetails()+"\n");
            writer.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void getMovimiento() {
        try {
            FileReader fileReader = new FileReader(this.FILE_PATH);
            BufferedReader reader = new BufferedReader(fileReader);
            for (String linea : reader.lines().collect(Collectors.toList())){
                System.out.println(linea);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void getGastos() {

    }
}
