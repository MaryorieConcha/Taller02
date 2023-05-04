package model;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria {
	private String nombre;
	private String direccion;
	private ArrayList<Cafe> cafes = new ArrayList<Cafe>();
	private RedSocial redSocial;

	public Cafeteria(String nombre, String direccion, ArrayList<Cafe> cafes, RedSocial redSocial) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.cafes = cafes;
		this.redSocial = redSocial;
	}

	public Cafeteria(){}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Cafe> getCafes() {
		return cafes;
	}

	public void setCafes(ArrayList<Cafe> cafes) {
		this.cafes = cafes;
	}

	public RedSocial getRedSocial() {
		return redSocial;
	}

	public void setRedSocial(RedSocial redSocial) {
		this.redSocial = redSocial;
	}

	public Cafeteria agregarCafe(String nombreCafe, int cantGramosCafe, int mililitrosAgua, Tamaño tamaño, IngredienteOpcional ingredienteOpcional){
		Cafe cafe = new Cafe(nombreCafe,cantGramosCafe, mililitrosAgua, tamaño, ingredienteOpcional);
		this.cafes.add(cafe);
		return cafe;
	}

	public boolean descontinuarCafe(String nombreCafe){
		for (Cafe cafe : this.cafes){
			if (cafe.getNombreCafe().equals(nombreCafe)){
				this.cafes.remove(cafe);
				return true;
			} else {
				return false;
			}
		}
	}

	public List<Cafe> obtenerLista(String nombreCafe){
		List
		for (Cafe cafe : this.cafes){
			if (this.cafes)
		}
	}

	public List<Vehiculo> buscarAutoNombreForBasico(String nombre) {
		List<Vehiculo> vehiculos = new ArrayList<>();
		for (int i = 0; i < this.vehiculosAVenta.size(); i++) {
			if (this.vehiculosAVenta.get(i).getNombre().equals(nombre)) {
				vehiculos.add(this.vehiculosAVenta.get(i));
			}
		}
		return vehiculos;
	}
}