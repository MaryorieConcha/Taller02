package principal;

import gui.VentanaMenu;
import model.Cafeteria;

public class Launcher {

	public static void main(String[] args) {
		Cafeteria cafeteria = new Cafeteria();
		VentanaMenu ventanaMenu = new VentanaMenu(cafeteria);
	}
}