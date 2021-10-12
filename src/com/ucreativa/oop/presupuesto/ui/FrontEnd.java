package com.ucreativa.oop.presupuesto.ui;

import com.ucreativa.oop.presupuesto.logicaNegocio.ImplementacionRegistro;
import com.ucreativa.oop.presupuesto.logicaNegocio.InterfaceRegistro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrontEnd extends JFrame {
    public FrontEnd(String titulo) {
        super(titulo);
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 300);
        super.setLayout(new GridLayout(8, 2));
    }
    public void build(){
        JLabel lblNombre = new JLabel("Nombre");
        JTextField txtNombre = new JTextField();

        JLabel lblMoneda = new JLabel("Moneda");
        JTextField txtMoneda = new JTextField();

        JLabel lblCategoria = new JLabel("Categoria");
        JTextField txtCategoria = new JTextField();

        JLabel lblMonto = new JLabel("Monto");
        JTextField txtMonto = new JTextField();

        JLabel lblPeriodicidad = new JLabel("Periodicidad");
        JTextField txtPeriodicidad = new JTextField();

        JCheckBox ckIngreso = new JCheckBox();
        ckIngreso.setSelected(true);
        ckIngreso.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblPeriodicidad.setVisible(!lblPeriodicidad.isVisible());
                txtPeriodicidad.setVisible(!txtPeriodicidad.isVisible());
            }
        });

        JButton salvar = new JButton("Salvar");
        JButton reporte = new JButton("Reporte");
        InterfaceRegistro registro = new ImplementacionRegistro();
        salvar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ckIngreso.isSelected()){
                    registro.addIngreso(
                            txtNombre.getText(),
                            txtMoneda.getText(),
                            txtCategoria.getText(),
                            txtMonto.getText(),
                            txtPeriodicidad.getText()
                    );
                }else{
                    registro.addGasto(txtNombre.getText(),
                            txtMoneda.getText(),
                            txtCategoria.getText(),
                            txtMonto.getText());
                }
            }
        });

        reporte.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registro.getGastos();
                registro.getMovimiento();
            }
        });


        super.add(lblNombre);
        super.add(txtNombre);
        super.add(lblMoneda);
        super.add(txtMoneda);
        super.add(lblMonto);
        super.add(txtMonto);
        super.add(lblPeriodicidad);
        super.add(txtPeriodicidad);
        super.add(ckIngreso);
        super.add(reporte);
        super.add(salvar);

    }
}
