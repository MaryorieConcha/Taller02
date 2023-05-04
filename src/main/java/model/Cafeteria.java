package model;

import java.util.ArrayList;
import model.Cafe;

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
}