//Timski rad na vježbama: Haris, Gordan, Selma i Adnan. Simulacija igre Left4Dead

//Igrica se zasniva na tome da se napravi ZombieApocalypse gdje ste vi igrac koji ima svoje osobine
//( ime, health, dexterity, weapon, strength, speed i intelligence) i probija se kroz horde zombija koje imaju takodje svoje 
//osobine ( ime, health, dexterity, weapon, strength i speed).Kada igrac naidje na zombija, ima opciju da li bjezi, ili ne. 
//Bjezanje ce uspjeti ako je igrac dovoljno mudar i brzi od zombija, ako ne, dolazi do dvoboja. Dvoboj se vrsi sve dok jedan
//od protivnika izgubi cijeli HP. Bitka se odvija tako sto jedan protivnik udara drugog i obrnuto. Taj udarac ovisi o mnogo 
//parametara napadaca (dexterity, weapon,strngth i intelligence). Postoje razna oruzja za igraca i zombija, kao i razlicite 
//vrste zombija raznih jacina. Poslije svakog dvoboja (ako igrac prezivi) treba ispisati preostali health igraca. Igrac je 
//pobjednik ako se uspije probiti kroz dovoljan broj zombija (ovisno koliko to korisnik postavi).
import java.util.Scanner;
public class KillZombie {
	

	

		Scanner in = new Scanner(System.in);
		
		public static Weapons oruzje()
		{
			Weapons oruzje = null;
			int randomNum2 = (int) (1 + Math.random()*(6-1) );
			if(randomNum2 == 1) oruzje = new Weapons("Sjekira", 120, 10, 0);
			if(randomNum2 == 2) oruzje = new Weapons("Pajser", 100, 10, 0);
			if(randomNum2 == 3) oruzje = new Weapons("Morotna pila", 300, 7, 0);
			if(randomNum2 == 4) oruzje = new Weapons("Utoka", 200, 7, 10);
			if(randomNum2 == 5) oruzje = new Weapons("Mitraljez", 300, 10, 50);
			if(randomNum2 == 6) oruzje = new Weapons("Sacmarica", 500, 10, 5);
			return oruzje;
			
		}
		
		public static void borba(Player igrac, Zombie enver)
		{
			double healthEnver = enver.HP;
			double healthIgrac = igrac.HP;
			while(healthEnver >0 && healthIgrac>0 ){
				
				healthEnver = healthEnver - igrac.Attack();
				healthIgrac = healthIgrac - enver.Attack();
				System.out.println("Health zombija je "  + healthEnver);
				System.out.println("Health Vede je "  + healthIgrac);
				System.out.println();
				
			}
			
			if(healthEnver <=0){
				System.out.println("Pobjednik SI!");
			}
			if(healthIgrac<=0){
				System.out.println("POBJEDNIK JE ZOMBIE BUHAHAHAHAHAHAH! LoÅ¡ si.");
			}
		}

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			Weapons oruzje1 = oruzje();
			Weapons oruzje2 = oruzje();
			
			Player igrac = new Player("Vedo_Killer92",700,2,oruzje1 ,10,15,2);
			Zombie enver = null;
			
			int randomNum = (int) (1 + Math.random()*(5-1) );
			if(randomNum == 1) enver = new Emina("Emina", 1000, 0.98, oruzje2, 9, 52);
			if(randomNum == 2) enver = new Smoken("Smoker", 800, 0.75, oruzje2, 8, 45);
			if(randomNum == 3) enver = new Spitter("Spitter", 700, 0.65, oruzje2, 7, 40);
			if(randomNum == 4) enver = new Charger("Charger", 450, 0.4, oruzje2, 4, 20);
			if(randomNum == 5) enver = new Jackey("Jackey", 500, 0.5, oruzje2, 5, 25);
			
		
			
			System.out.println("Pola 3 je. Hodate napustenom ulicom\n"
					+ ".Odjednom cujete uzasne krikove. Ugledate djevojcicu\n"
					+ " sa medvjedicem kojoj viri lobanja. Napao vas je zombie. \nSta cete uraditi?\n"
					+ "Vi imate " + oruzje1.getIme() + ", a zombi " + oruzje2.getIme());
			System.out.println("\n(unesite 1 ako zelite napasti, unesite 2 ako zelite pokusati da bjezite.");
			int odabir = in.nextInt();
			
			if(odabir == 1){
				borba(igrac, enver);
				
			}
			if(odabir == 2){
				
				boolean beg = igrac.escChance(enver);
				
				if(beg == false) 
				{
					System.out.println("Bijeg nije opcija, moras se boriti!");
					borba(igrac, enver);
				}
				if(beg == true) System.out.println("POBJEGAO SI,ovaj put.");
			}
			
		}
	}