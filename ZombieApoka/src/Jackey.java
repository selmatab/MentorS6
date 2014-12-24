
public class Jackey extends Zombie {
	
		//Selma
			public Jackey(String name, double HP, double Dexterity, Weapons weapon,
					double strength, double speed) {
				super("Jackey", 500, 0.50, weapon, 5, 25);
				
			}

			@Override
			public double specialAttack() {

				double damageJackey;
				damageJackey =  2 + Math.random() * 7 * super.Attack();
				if(damageJackey == 2) return 0;
				
				return damageJackey;	
				
			}

			@Override
			public double Attack() {
			
				return super.Attack();
			}

		}