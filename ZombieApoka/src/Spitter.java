
public class Spitter extends Zombie{
	// Adnan
		public Spitter(String name, double HP, double Dexterity, Weapons weapon,
				double strength, double speed) {
			super("Spitter", 700, 0.65, weapon, 7, 40);
				
		}

		@Override
		public double specialAttack() {
			
			double damageSpitter;
			damageSpitter =  3 + Math.random() * 8 * super.Attack();
			if(damageSpitter == 3) return 0;
			
			return damageSpitter;
		}

		@Override
		public double Attack() {
			return super.Attack();
		}

		
	}

