// Prodavnica igracaka, vjezbanje klasa.


public class ToyTest {
	public static void main(String[] args) {

		Toy prva = new Toy("name", "tip", 10.12);
		Toy druga = new Toy("name2", "tip2", 10.22, 4, 5);
		Toy treca = new Toy("name3", "tip3", 10.32, 1989, 5);
		Toy cetvrta = new Toy("name4", "tip4", 10.42, 4, 5);
		Toy peta = new Toy("name5", "tip5", 10.12);
		Toy kopija = new Toy(prva);
		ToyStore store = new ToyStore("Store 12");
		store.addToy(prva);
		store.addToy(druga);
		store.addToy(treca);
		store.addToy(cetvrta);
		store.addToy(kopija);

		System.out.println(store.toString());
	}

}
