package model;

public enum IngredienteOpcional {
	Crema("Crema"),
	Leche("Leche"),
	Chocolate("Chocolate");
	private String ingredienteOpcional;

	IngredienteOpcional(String ingredienteOpcional) {
		this.ingredienteOpcional = ingredienteOpcional;
	}
}