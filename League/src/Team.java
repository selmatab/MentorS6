
public class Team {
	private Player[] squad = new Player[11];
		private String name;
		private String city;
		private Staff employee;
		private int NumberOfPLayers=0;

		public String getName() {
			return name;
		}

		public void setName(String name){
			this.name = name;
		}

		public Player[] getSquad() {
			return squad;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public Staff getEmployee() {
			return employee;
		}

		public Team(String name, String city, Staff employee) {
			setName(name);
			setCity(city);
			this.employee = new Staff(employee);
		}

		public void addPlayer(Player other) {
			squad[NumberOfPLayers] = new Player(other);
			NumberOfPLayers++;
		}

		public Team() {
			setName("NULL");
			setCity("NULL");
			this.employee = new Staff();
		}

		public Team(Team other) {
			for (int i = 0; i < NumberOfPLayers; i++) {
				this.squad[i] = new Player(other.squad[i]);
			}
			setCity(other.city);
			setName(other.name);
			this.employee = new Staff(other.employee);
			this.NumberOfPLayers=other.NumberOfPLayers;

		}

		public double getRating() {
			int sumOfSkills = 0;
			for (int i = 0; i < squad.length; i++) {
				sumOfSkills += skillSum(squad[i].getSkill());
			}
			return LuckyFactor() * sumOfSkills;
		}

		public double LuckyFactor() {
			return RandomNum(RandomNum(0, 3), RandomNum(5, 10));
		}

		public double RandomNum(double min, double max) {
			return min + Math.random() * (max - min);
		}

		public double skillSum(Skills skill) {
			return skill.getHeader() + skill.getPass() + skill.getShoot()
					+ skill.getSpeed();
		}

		public String toString() {
			String out = "";
			out += "Name: " + this.name + "\tCity: " + this.city + "\nCoach:\n"
					+ this.employee;
			out += "\nPlayers: \n\n";
			for (int i = 0; i < squad.length; i++) {
				out += (i + 1) + ". : " + this.squad[i].toString();
			}
			out += "\n";
			return out;
		}

		public void setEmployee(Staff employee) {
			this.employee = employee;
		}

	}
