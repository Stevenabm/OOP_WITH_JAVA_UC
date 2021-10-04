package com.ucreativa.oop.presupuesto.entidades;

import java.util.ArrayList;
import java.util.List;

public class RegistroGastos {
    List<Gasto> gastos;

    public RegistroGastos(){
        this.gastos = new ArrayList<>();
    }

    public List<Gasto> getGastos() {
        return this.gastos;
    }

    public void addGastos(Gasto item){
        this.gastos.add(item);
    }
}
