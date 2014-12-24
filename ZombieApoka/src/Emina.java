
public class Emina extends Zombie{
	//Haris
	
		public Emina(String name, double HP, double Dexterity, Weapons weapon, double strength, double speed) {
			super("Emina", 1000, 0.98, weapon, 9, 52);

		}

		@Override
		public double specialAttack() {
			
			double damageEmine;
			damageEmine =  5 + Math.random() * 10 * super.Attack();
			if(damageEmine == 5) return 0;
			
			return damageEmine;
		}

		@Override
		public double Attack() {
			return super.Attack();
		}

		
		
		
	}

