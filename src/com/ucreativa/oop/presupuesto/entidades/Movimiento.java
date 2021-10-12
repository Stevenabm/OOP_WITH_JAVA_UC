package com.ucreativa.oop.presupuesto.entidades;

import java.util.Date;

public abstract class Movimiento {
    private String nombre;
    private String moneda;
    private String categoria;
    private int monto;
    private Date fecha;

    public Movimiento(String nombre, String moneda, String categoria, int monto){
        this.nombre = nombre;
        this.moneda = moneda;
        this.categoria = categoria;
        this.monto = monto;
        this.fecha = new Date();
    }

    String getNombre(){
        return this.nombre;
    }

    String getMoneda(){
        return this.moneda;
    }

    String getCategoria(){
        return this.moneda;
    }

    int getMonto(){
        return this.monto;
    }

    Date getFecha(){
        return this.fecha;
    }

    public abstract String getDetails();

}
