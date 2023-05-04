package model;

public class Cafe {
	private int cantGramosCafe;
	private int mililitrosAgua;
	private Cafeteria cafeteria;
	private Tamaño tamaño;
	private IngredienteOpcional ingredienteOpcional;

	public Cafe(int cantGramosCafe, int mililitrosAgua, Tamaño tamaño, IngredienteOpcional ingredienteOpcional) {
		this.cantGramosCafe = cantGramosCafe;
		this.mililitrosAgua = mililitrosAgua;
		this.tamaño = tamaño;
		this.ingredienteOpcional = ingredienteOpcional;
	}

	public int getCantGramosCafe() {
		return cantGramosCafe;
	}

	public void setCantGramosCafe(int cantGramosCafe) {
		this.cantGramosCafe = cantGramosCafe;
	}

	public int getMililitrosAgua() {
		return mililitrosAgua;
	}

	public void setMililitrosAgua(int mililitrosAgua) {
		this.mililitrosAgua = mililitrosAgua;
	}

	public Tamaño getTamaño() {
		return tamaño;
	}

	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}

	public IngredienteOpcional getIngredienteOpcional() {
		return ingredienteOpcional;
	}

	public void setIngredienteOpcional(IngredienteOpcional ingredienteOpcional) {
		this.ingredienteOpcional = ingredienteOpcional;
	}
}