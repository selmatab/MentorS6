
public class Charger extends Zombie {
	//Gordan

		public Charger(String name, double HP, double Dexterity, Weapons weapon,
				double strength, double speed) {
			super("Charger", 450, 0.4, weapon, 4, 20);
			// TODO Auto-generated constructor stub
		}

		@Override
		public double specialAttack() {

			double damageCharger;
			damageCharger =  1 + Math.random() * 6 * super.Attack();
			if(damageCharger == 1) return 0;
			
			return damageCharger;	
			
		}

		@Override
		public double Attack() {
		
			return super.Attack();
		}

	}

