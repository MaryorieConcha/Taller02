package gui;

import model.Cafeteria;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaMenu extends Ventana implements JFrame {
    private JLabel textoEncabezado;
    private JButton botonAgregarCafe, botonDescontinuarCafe, botonObtenerListaCafe, botonModificarInformacionCafeteria;
    private Cafeteria cafeteria;

    public VentanaMenu(Cafeteria cafeteria){
        super("Menu", 500, 520);
        this.cafeteria=cafeteria;
        generarElementosVentana();
    }
    private void generarElementosVentana(){
        generarEncabezado();
        generarBotonAgregarCafe();
        generarBotonDescontinuarCafe();
        generarBotonObtenerListaCafe();
        generarBotonModificarInformacionCafeteria();
    }

    private void generarEncabezado(){
        String textoCabecera = "Menú";
        super.generarJLabelEncabezado(this.textoEncabezado,textoCabecera,190,10,200,50);
    }

    private void generarBotonAgregarCafe(){
        String textoBoton = "Agregar Café";
        this.botonAgregarCafe = super.generarBoton(textoBoton,75,200,150,20);
        this.add(this.botonAgregarCafe);
        this.botonAgregarCafe.addActionListener(this);
    }

    private void generarBotonDescontinuarCafe(){
        String textoBoton = "Descontinuar Café";
        this.botonDescontinuarCafe = super.generarBoton(textoBoton,75,250,150,20);
        this.add(this.botonDescontinuarCafe);
        this.botonDescontinuarCafe.addActionListener(this);
    }

    private void generarBotonObtenerListaCafe(){
        String textoBoton = "Lista de Cafés";
        this.botonObtenerListaCafe = super.generarBoton(textoBoton,75,300,150,20);
        this.add(this.botonObtenerListaCafe);
        this.botonObtenerListaCafe.addActionListener(this);
    }

    private void generarBotonModificarInformacionCafeteria(){
        String textoBoton = "Agregar Café";
        this.botonModificarInformacionCafeteria = super.generarBoton(textoBoton,75,350,150,20);
        this.add(this.botonModificarInformacionCafeteria);
        this.botonModificarInformacionCafeteria.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonAgregarCafe) {
            VentanaAgregarCafe ventanaAgregarCafe = new VentanaAgregarCafe();
            this.dispose();
        }
        if (e.getSource() == this.botonDescontinuarCafe){
            VentanaDescontinuarCafe ventanaDescontinuarCafe = new VentanaDescontinuarCafe();
            this.dispose();
        }
        if (e.getSource() == this.botonObtenerListaCafe){
            VentanaModificarInformacionCafeteria ventanaModificarInformacionCafeteria = new VentanaModificarInformacionCafeteria();
            this.dispose();
        }
    }
}