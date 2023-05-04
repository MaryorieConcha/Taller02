package controller;

import data.GestorDatos;
import model.Cafeteria;
import model.IngredienteOpcional;
import model.RedSocial;
import model.Tamaño;

import java.util.List;

public class CafeteriaController {
    Cafeteria cafeteria;
    public static Cafeteria cargaMasivaDatos(Cafeteria cafeteria){
        GestorDatos.leerArchivoCafes(cafeteria, "cafes.txt");
        return cafeteria;
    }
    public static List obtenerListaCafe(Cafeteria cafeteria, String nombre){
        return cafeteria.buscarAutoNombre(nombre);
    }
    public static Cafeteria agregarCafe(Cafeteria cafeteria, String nombreCafe, int cantGramosCafe,
                                        int mililitrosAgua, Tamaño tamaño,
                                        IngredienteOpcional ingredienteOpcional){
        return cafeteria.agregarCafe(nombreCafe, cantGramosCafe, mililitrosAgua, tamaño, ingredienteOpcional);
    }
    public static boolean descontinuarCafe(Cafeteria cafeteria, String nombreCafe){
        return cafeteria.descontinuarCafe(nombreCafe);
    }

    public void modificarInformacionCafeteria(String nombre, String direccion, RedSocial redSocial) {
        if (cafeteria.getNombre().equals(nombre)) {
            cafeteria.setNombre(nombre);
            cafeteria.setDireccion(direccion);
            cafeteria.setRedSocial(redSocial);
        }
    }

    public static void almacenarDatos(Cafeteria cafeteria){
        GestorDatos.registrarDatos(cafeteria.getCafes(),"cafes.txt");
    }
}