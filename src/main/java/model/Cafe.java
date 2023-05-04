package model;

public class Cafe {
	private String nombreCafe;
	private int cantGramosCafe;
	private int mililitrosAgua;
	private Cafeteria cafeteria;
	private Tamaño tamaño;
	private IngredienteOpcional ingredienteOpcional;

	public Cafe(String nombreCafe,int cantGramosCafe, int mililitrosAgua, Tamaño tamaño, IngredienteOpcional ingredienteOpcional) {
		this.nombreCafe = nombreCafe;
		this.cantGramosCafe = cantGramosCafe;
		this.mililitrosAgua = mililitrosAgua;
		this.tamaño = tamaño;
		this.ingredienteOpcional = ingredienteOpcional;
	}

	public String getNombreCafe() {
		return nombreCafe;
	}

	public void setNombreCafe(String nombreCafe) {
		this.nombreCafe = nombreCafe;
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