package gui;

import model.Cafeteria;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaDescontinuarCafe extends Ventana {
    private JLabel textoEncabezado,textoNombreCafe, textoCantGramosCafe, textoMililitrosAgua, textoTamaño, textoIngredienteOpcional;
    private JTextField campoNombreCafe, campoCantGramosCafe, campoMililitrosAgua, campoTamaño, campoIngredienteOpcional;
    private JButton botonDescontinuar, botonCancelar;
    private Cafeteria cafeteria;

    public VentanaDescontinuarCafe() {
        super("Descontinuar Café", 500,520);
        generarElementosVentana();
    }

    private void generarElementosVentana(){
        generarEncabezado();
        generarBotonDescontinuar();
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

    private void generarBotonDescontinuar() {
        String textoBoton= "Descontinuar";
        this.botonDescontinuar = super.generarBoton(textoBoton, 75, 400, 150, 20);
        this.add(this.botonDescontinuar);
        this.botonDescontinuar.addActionListener(this);
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

    private boolean descontinuarCafe(){
        return cafeteria.descontinuarCafe(this.campoNombreCafe.getText()
        );
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonDescontinuar) {
            if(descontinuarCafe()) {
                JOptionPane.showMessageDialog(this,"Café eliminado correctamente");
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