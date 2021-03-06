package com.ucreativa.oop.presupuesto.entidades;

import java.util.Date;

public class Gasto extends Movimiento {

    public Gasto(String nombre, String moneda, String categoria, int monto){
        super(nombre, moneda, categoria, monto);
    }

    @Override
    public String getDetails() {
        return "GASTO: " + this.getNombre() + " - " +
                this.getMoneda() + " - " +
                this.getCategoria() + " - " +
                this.getMonto();
    }

}
