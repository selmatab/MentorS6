
public class Smoken extends Zombie{
	//Gordan
	
		public Smoken(String name, double HP, double Dexterity, Weapons weapon,
				double strength, double speed) {
			super("Smoker", 800, 0.75, weapon, 8, 45);
			// TODO Auto-generated constructor stub
		}

		@Override
		public double specialAttack() {
			
			double damageSmoker;
			damageSmoker =  4 + Math.random() * 9 * super.Attack();
			if(damageSmoker == 4) return 0;
			
			return damageSmoker;
		}

		@Override
		public double Attack() {
			return super.Attack();
		}

		
	}

