
public class Player {
	private String name;
	private String surname;
	private int number;
	private Skills skill;

	public Player() {
		String empty="NULL";
		setName(empty);
		setSurname(empty);
		setNumber(1);
		this.skill = new Skills();
	}

	public Player(String name, String surname, int number, Skills skill) {
		setName(name);
		setSurname(surname);
		setNumber(number);
		this.skill = new Skills(skill);
	}

	public Player(Player other) {
		setName(other.name);
		setSurname(other.surname);
		setNumber(other.number);
		skill = new Skills(other.skill);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Skills getSkill() {
		return skill;
	}
	public String toString(){
		String out="";
		out+="Name: "+ this.name+ "\tSurname: "+ this.surname+ "\tKit number: "+this.number;
		out+="\nSkills:\n";
		out+=this.skill.toString();
		return out;
	}
}