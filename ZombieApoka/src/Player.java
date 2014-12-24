
public class Player extends Character {
	//Adnan
	
		private double intel;
		
		public Player(String name, double HP, double dexterity, Weapons weapon, double strength, double speed, double intel)
		{	
			this.name = name;
			this.HP = HP;
			this.dexterity = dexterity;
			this.weapon = weapon;
			this.strenght = strength;
			this.speed = speed;
			this.intel = intel;
		}
		
		public void setIntel(double intel) {
			double temp;
			temp = 0.5 + Math.random() * (2-0.5);
			this.intel = temp;
		}
		

		@Override
		public String toString() {
			String temp="Intel: "+intel;
			return super.toString()+temp;
		}

		@Override
		public boolean equals(Object obj) {
		
			return super.equals(obj);
		}

		@Override
		public double Attack() {
			return super.Attack() * this.intel;
		}
		
		public boolean escChance(Character z)
		{
			int escape = (int) ((this.intel*this.speed)/z.speed);
			if (escape == 0)
			{
				return false;
			}
			return true;
		}
		
	}

