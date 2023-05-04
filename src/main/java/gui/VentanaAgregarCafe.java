package gui;

import model.Cafeteria;
import model.IngredienteOpcional;
import model.Tamaño;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaAgregarCafe extends Ventana {
    private JLabel textoEncabezado, textoNombreCafe, textoCantGramosCafe, textoMililitrosAgua, textoTamaño, textoIngredienteOpcional;
    private JTextField campoNombreCafe, campoCantGramosCafe, campoMililitrosAgua, campoTamaño, campoIngredienteOpcional;
    private JButton botonAgregar, botonCancelar;
    private Cafeteria cafeteria;

    public VentanaAgregarCafe() {
        super("Agregar Café", 500,520);
        generarElementosVentana();
    }

    private void generarElementosVentana(){
        generarEncabezado();
        generarBotonRegistrar();
        generarBotonCancelar();
        generarCampoNombreCafe();
        generarCampoCantGramosCafe();
        generarCampoMililitrosAgua();
        generarCampoTamaño();
        generarCampoIngredienteOpcional();
    }

     private void generarEncabezado() {
            String textoCabecera = "Registro de cafe";
            super.generarJLabelEncabezado(this.textoEncabezado, textoCabecera, 190, 10, 200, 50);
    }

    private void generarBotonRegistrar() {
        String textoBoton= "Agregar";
        this.botonAgregar = super.generarBoton(textoBoton, 75, 400, 150, 20);
        this.add(this.botonAgregar);
        this.botonAgregar.addActionListener(this);
    }

    private void generarBotonCancelar() {
        String textoBoton= "Cancelar";
        this.botonCancelar = super.generarBoton(textoBoton, 75, 350, 150, 20);
        this.add(this.botonCancelar);
        this.botonCancelar.addActionListener(this);
    }

    private void generarCampoNombreCafe(){
        String textoNombreCAfe= "Nombre del Cafe:";
        super.generarJLabel(this.textoNombreCafe,textoNombreCAfe,20,50,150,20);
        this.campoNombreCafe= super.generarJTextField(200,50,250,20);
        this.add(this.campoNombreCafe);
    }

    private void generarCampoCantGramosCafe(){
        String textoCantGramosCafe= "Cantidad de Gramos de Cafe:";
        super.generarJLabel(this.textoCantGramosCafe,textoCantGramosCafe,20,50,150,20);
        this.campoCantGramosCafe= super.generarJTextField(200,50,250,20);
        this.add(this.campoCantGramosCafe);
    }

    private void generarCampoMililitrosAgua(){
        String textoMilillitrosAgua = "Mililitros de Agua:";
        super.generarJLabel(this.textoMililitrosAgua, textoMilillitrosAgua,20,50,150,20);
        this.campoMililitrosAgua= super.generarJTextField(200,50,250,20);
        this.add(this.campoMililitrosAgua);
    }

    private void generarCampoTamaño(){
        String textoTamaño = "Tamaño:";
        super.generarJLabel(this.textoTamaño,textoTamaño,20,50,150,20);
        this.campoTamaño= super.generarJTextField(200,50,250,20);
        this.add(this.campoTamaño);
    }

    private void generarCampoIngredienteOpcional(){
        String textoIngredienteOpcional = "Ingrediente Opcional:";
        super.generarJLabel(this.textoIngredienteOpcional,textoIngredienteOpcional,20,50,150,20);
        this.campoIngredienteOpcional= super.generarJTextField(200,50,250,20);
        this.add(this.campoIngredienteOpcional);
    }

    private boolean agregarCafe(){
        return cafeteria.agregarCafe(this.campoNombreCafe.getText(),Integer.parseInt(this.campoCantGramosCafe.getText()),Integer.parseInt(this.campoMililitrosAgua.getText()),
                Tamaño.valueOf(this.campoTamaño.getText()), IngredienteOpcional.valueOf(this.campoIngredienteOpcional.getText()));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonAgregar) {
            if(agregarCafe()) {
                JOptionPane.showMessageDialog(this,"Café registrado correctamente");
                VentanaMenu ventanaMenu = new VentanaMenu(cafeteria);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this,"Ingrese dato válido");
            }

        }
        if (e.getSource() == this.botonCancelar){
            VentanaMenu ventanaMenu = new VentanaMenu(cafeteria);
            this.dispose();
        }

    }
}