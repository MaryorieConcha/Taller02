package model;

public class Cafe {
	private int cantGramosCafe;
	private int mililitrosAgua;
	private Cafeteria cafeteria;
	private Tamaño tamaño_;
	private IngredienteOpcional ingredienteOpcional;

	public Cafe(int cantGramosCafe, int mililitrosAgua, Cafeteria cafeteria, Tamaño tamaño_, IngredienteOpcional ingredienteOpcional) {
		this.cantGramosCafe = cantGramosCafe;
		this.mililitrosAgua = mililitrosAgua;
		this.cafeteria = cafeteria;
		this.tamaño_ = tamaño_;
		this.ingredienteOpcional = ingredienteOpcional;
	}
}