

import java.awt.Color;

public class ToyStore {

	private String name;
	private Toy[] inventory;
	private int numToys;

	public ToyStore(String name) {
		setName(name);
		inventory = new Toy[10];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 1) {
			throw new IllegalArgumentException("Ime nije definisano!");
		} else
			this.name = name;
	}

	public void addToy(Toy newToy) {
		for (int i = 0; i < numToys; i++) {
			if (inventory[i].equals(newToy)) {
				inventory[i].increaseQuantity(newToy.getQuantyty());

			}
		}
	}

	public void removeToy(Toy newToy) {
		for (int i = 0; i < numToys; i++) {
			if (inventory[i].equals(newToy)) {
				for (int j = 0; j < numToys - 1; j++) {
					inventory[j] = inventory[j + 1];

				}
			}
			numToys--;
		}

		inventory[numToys] = new Toy(newToy);
		numToys++;
		if (numToys == inventory.length) {
			resize();
		}
	}

	private void resize() {
		int newSize = this.inventory.length * 2;
		Toy[] temp = new Toy[newSize];
		for (int i = 0; i < newSize; i++) {
			temp[i] = this.inventory[i];
		}
		this.inventory = temp;

	}

	public String toString() {
		String str = "";

		for (int i = 0; i < numToys; i++) {
			str = str + "Name: " + name + "\n" + inventory[i] + "\n"
					+ "Num Toys: " + numToys;
		}
		return str;
	}
}
