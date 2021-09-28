package com.ucreativa.oop.lab01;

public class Main {
    static void metodo()
    {
        System.out.println("Hola Mundo.");
    }

    public static void main(String[] args)
    {
        //Variables
        String operador = "-";
        int num1 = 5;
        Integer num2 = 44;
        float resultado = 0;
        boolean estado = false;

        //Condicionales
        if (estado)
        {
            System.out.println("Estado activado.");
        }
        else
        {
            System.out.println("Estado Desactivado.");
        }

        switch(operador)
        {
            case "+":
                resultado = num1 + num2;
                System.out.println(resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println(resultado);
                break;
            default:
                System.out.println("Operador incorrecto.");
        }

        //Loops
        int i = 1;
        resultado = 1;
        while (i <= num1)
        {
            resultado *= i;
            i++;
        }
        System.out.println("El resultado de "+ num1 +"! es: " + resultado);

        for (int j = 0; j < num1; j++) {
            System.out.println("El valor actual de j es: "+ j);
        }

        //Arrays
        String[] objetos = {"Carro","blanco"};
        System.out.println("El valor del indice 1 es: "+objetos[1]);

        //Método Estático
        metodo();
    }
}
