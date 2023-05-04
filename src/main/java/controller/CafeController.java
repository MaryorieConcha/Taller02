package controller;


import model.Cafe;
import model.Cafeteria;
import model.IngredienteOpcional;
import model.Tamaño;

public class CafeController {
    public Cafeteria agregarCafe(String nombreCafe, int cantGramosCafe, int mililitrosAgua, Tamaño tamaño, IngredienteOpcional ingredienteOpcional){
        Cafe cafe = new Cafe(nombreCafe,cantGramosCafe, mililitrosAgua, tamaño, ingredienteOpcional);
        this.cafes.add(cafe);
        return cafe;
    }

}