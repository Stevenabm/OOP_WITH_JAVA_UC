package com.ucreativa.oop.presupuesto.logicaNegocio;

import com.ucreativa.oop.presupuesto.entidades.Movimiento;

import java.util.List;

public interface InterfaceRegistro {

    void getMovimiento();

    void addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad);

    void addGasto(String nombre, String moneda, String categoria, String montoStr);


    void getGastos();

}
