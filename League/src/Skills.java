
public class Skills {
	private double speed;
	private double pass;
	private double shoot;
	private double header;

	public String toString() {
		String out = "";
		out += "Speed: " + this.speed;
		out += "\nPass: " + this.pass;
		out += "\nShoot: " + this.shoot;
		out += "\nHeader: " + this.header;
		out+="\n\n";
		return out;
	}

	public Skills() {
		setSpeed(1);
		setPass(1);
		setShoot(1);
		setHeader(1);
	}

	public Skills(double speed, double pass, double shoot, double header) {
		setSpeed(speed);
		setPass(pass);
		setShoot(shoot);
		setHeader(header);
	}

	public Skills(Skills skill) {
		setSpeed(skill.speed);
		setPass(skill.pass);
		setShoot(skill.shoot);
		setHeader(skill.header);
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getPass() {
		return pass;
	}

	public void setPass(double pass) {
		this.pass = pass;
	}

	public double getShoot() {
		return shoot;
	}

	public void setShoot(double shoot) {
		this.shoot = shoot;
	}

	public double getHeader() {
		return header;
	}

	public void setHeader(double header) {
		this.header = header;
	}

}
