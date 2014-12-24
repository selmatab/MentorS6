

public class Toy {
	
	private String name;
	private String type;
	private double price;
	private int manYear;
	private int ageRestriction;
	private int quantity;
	
	
	public Toy(String name, String type, double price){
	      setName(name);
	      setType(type);
	      setPrice(price);
	      setManYear(2014);
	      setAgeRestriction(0);
	      setQuantity(1);
	}
	
	
	public Toy(String name, String type, double price, int manYearOrageRestr, int quantity){
	      setName(name);
	      setType(type);
	      setPrice(price);
	      setManYear(2014);
	      setAgeRestriction(0);
	      setQuantity(1);
		
		if (manYearOrageRestr < 100){
			setAgeRestriction(manYearOrageRestr);
		} else {
			setManYear(manYearOrageRestr);
		}
		setQuantity(quantity);
	}
	
	public Toy(String name, String type, double price, int manYear, int ageRestriction, int quantity){
	      setName(name);
	      setType(type);
	      setPrice(price);
	      setManYear(manYear);
	      setAgeRestriction(ageRestriction);
	      setQuantity(quantity);
	}
	
	public Toy (Toy other){
		this.name = other.name;
		this.type = other.type;
		this.price = other.price;
		this.manYear = other.manYear;
		this.ageRestriction = other.ageRestriction;
		this.quantity = other.quantity;
	}


	
    public void setName(String name) {
    	if ( name.length()< 1){
    		throw new IllegalArgumentException("Ime prazno!");
    	} else {
		this.name = name;
    	}
	}

	public void setType(String type) {
		if ( type.length()< 1){
    		throw new IllegalArgumentException("Ime prazno!");
    	} else {
    	this.type = type;
        }
	}

	public void setPrice(double price) {
		if (price < 0){
			throw new IllegalArgumentException("Ne moze cijena biti manja od nule");
		} else {
		this.price = price;
		}
	}
	
	public void setManYear(int manYear) {
		this.manYear = manYear;
	}

	public void setAgeRestriction(int ageRestriction) {
		this.ageRestriction = ageRestriction;
	}
	
	public void setQuantity (int quantity) {
		if (this.quantity == quantity){
			throw new IllegalArgumentException("Kolicina manja od jedan");
		} else {
		this.quantity = quantity;
		}
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	public int getManYear() {
		return manYear;
	}
public int getQuantyty(){
	return quantity;
}
	public int getAgeRestriction() {
		return ageRestriction;
	}

	public String toString() {
		return "Name: " + name + "\n" + "Type: " + type + "\n" + "Price: " + price
				+ "\n" + "manYear: " + manYear + "\n" + "AgeRestriction=" + ageRestriction + "\n" + "Quantity: "
				+ quantity;
	}

	public boolean equals(Toy other) {
		if (this.name.equals(other.name) && this.type.equals(other.type) 
				&& this.price == other.price && this.ageRestriction == other.ageRestriction
				&& this.manYear == other.manYear) {
			return true;
		} else {
			return false;
		}	
	}
	void increaseQuantity(int additional){
		
	}
}