//Klasa liga ima niy timova koji igraju utakmice,
//pobjednik utakmice je tim ciji igraci imaju bolje sklills pomnozene faktorom srece kojije random broj.
//kada tim izgubi zybacujemo ga iz niza dok ne dobijemo pobjednika.
public class LeagueTest {
	public static void main(String[] args) {
		int leagueSize=TextIO.getInt();
		League first = new League(leagueSize);
		Skills second = new Skills(85, 72, 66, 90);
		System.out.println(second);
		Player one = new Player("Arris", "Hare", 10, second);
		System.out.println(one);
		Staff coach = new Staff("Musa", "Dembele", "musa@hotmail.com", "Coach");
		System.out.println(coach);
		Team arsenal = new Team("Arsenal", "London", coach);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		System.out.println(arsenal.toString());
		Skills amateur = new Skills(45, 55, 33, 49);
		Player two = new Player("Alexis", "Sanchez", 17, amateur);
		Team sarajevo = new Team("F.K. Sarajevo", "Sarajevo", coach);
		sarajevo.addPlayer(two);
		sarajevo.addPlayer(two);
		sarajevo.addPlayer(one);
		sarajevo.addPlayer(two);
		sarajevo.addPlayer(one);
		sarajevo.addPlayer(two);
		sarajevo.addPlayer(one);
		sarajevo.addPlayer(two);
		sarajevo.addPlayer(two);
		sarajevo.addPlayer(one);
		sarajevo.addPlayer(two);
		System.out.println(sarajevo.toString());
		first.addTeam(arsenal);
		first.addTeam(sarajevo);
		Skills pro = new Skills(90, 95, 99, 98);
		Player three = new Player("Nicklas", "Bendtner", 52, pro);
		Team bvb = new Team("Borussia Dortmund", "Dortmund", coach);
		Team roma = new Team("A.S. Roma", "Rim", coach);
		bvb.addPlayer(one);
		bvb.addPlayer(two);
		bvb.addPlayer(three);
		bvb.addPlayer(one);
		bvb.addPlayer(two);
		bvb.addPlayer(three);
		bvb.addPlayer(one);
		bvb.addPlayer(two);
		bvb.addPlayer(three);
		bvb.addPlayer(one);
		bvb.addPlayer(two);
		roma.addPlayer(three);
		roma.addPlayer(three);
		roma.addPlayer(one);
		roma.addPlayer(three);
		roma.addPlayer(three);
		roma.addPlayer(one);
		roma.addPlayer(three);
		roma.addPlayer(three);
		roma.addPlayer(one);
		roma.addPlayer(three);
		roma.addPlayer(three);
		first.addTeam(roma);
		first.addTeam(bvb);
		first.startCup();
		System.out.println(first.loser(arsenal, sarajevo).getName());
		System.out.println(first.loser(bvb, roma).getName());
		first.prepareForNextStage();
		for (int i = 0; i < leagueSize/2; i++)
			System.out.println(first.getTeam(i).getName());
	}

}

