package com.ucreativa.oop.presupuesto.entidades;

import java.util.Date;

public class Ingreso extends Movimiento {
    private String periodicidad;

    public Ingreso(String nombre, String moneda, String categoria, int monto, String periodicidad){
        super(nombre, moneda, categoria, monto);
        this.periodicidad = periodicidad;
    }
    @Override
    public String getNombre(){
        return super.getNombre() + " " + this.periodicidad;
    }

    @Override
    public String getDetails() {
        return "GASTO: " + this.getNombre() + " - " +
                this.getMoneda() + " - " +
                this.getCategoria() + " - " +
                this.getMonto() + " - " +
                this.periodicidad;
    }

}
