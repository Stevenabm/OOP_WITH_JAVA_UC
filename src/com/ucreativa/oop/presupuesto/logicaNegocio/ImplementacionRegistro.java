package com.ucreativa.oop.presupuesto.logicaNegocio;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.entidades.Movimiento;

import java.util.ArrayList;
import java.util.List;

public class ImplementacionRegistro implements InterfaceRegistro, InterfaceReportes {
    List<Movimiento> movimientos;

    public ImplementacionRegistro(){
        this.movimientos = new ArrayList<>();
    }

    public void getGastos(){
        List<Gasto> respuesta = new ArrayList<>();
        for (Movimiento movimiento : this.movimientos){
            if (movimiento instanceof Gasto){
                System.out.println(movimiento.getDetails());
            }
        }
    }

    public void getMovimiento() {
        for(Movimiento movimientos : movimientos){
            System.out.println(movimientos.getDetails());
        }
    }

    @Override
    public void addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) {
        if (!moneda.equals("USD")){
           System.out.println("Moneda no valida.");
        }else{
            int monto = Integer.parseInt(montoStr);
            this.movimientos.add(new Ingreso(nombre,moneda,categoria,monto,periodicidad));
        }
    }

    @Override
    public void addGasto(String nombre, String moneda, String categoria, String montoStr) {
        int monto = Integer.parseInt(montoStr);
        this.movimientos.add(new Gasto(nombre,moneda,categoria,monto));
    }

    @Override
    public void ImprimirReporte() {

    }
}
