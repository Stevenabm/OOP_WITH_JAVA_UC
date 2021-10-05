package com.ucreativa.oop.presupuesto.entidades;

import java.util.ArrayList;
import java.util.List;

public class RegistroMovimientos {
    List<Movimiento> movimientos;

    public RegistroMovimientos(){
        this.movimientos = new ArrayList<>();
    }

    public List<Gasto> getGastos(){
        List<Gasto> respuesta = new ArrayList<>();
        for (Movimiento movimiento : this.movimientos){
            if (movimiento instanceof Gasto){
                respuesta.add((Gasto) movimiento);
            }
        }
        return respuesta;
    }

    public List<Movimiento> getMovimiento() {
        return this.movimientos;
    }

    public void addMovimiento(Movimiento item){
        this.movimientos.add(item);
    }
}
