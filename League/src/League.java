
public class League {
	private Team[] teams;
	private int numTeams = 0;
	

	public Team getTeam(int place) {
		return teams[place];
	}
	public League(int number) {
		this.teams = new Team[number];
	}

	public void addTeam(Team other) {
		teams[numTeams] = other;
		numTeams++;
	}

	public void startCup() {
		int size = numTeams-1;
		int games= numTeams/2;
		for (int i = 0; i < games; i++) {
			removeTeam(loser(teams[i], teams[size]));
			size--;
		}
		prepareForNextStage();
	}

	public void removeTeam(Team loser) {
		loser.setName("loser");
		numTeams--;
	}

	public Team loser(Team team, Team team2) {
		if (team.getRating() < team2.getRating())
			return team;
		else
			return team2;
	}
	public void prepareForNextStage(){
		if(teams.length>2){
		Team [] tmp= new Team[teams.length/2];
		int counter=0;
		for(int i =0 ;i<teams.length;i++){
			if (!teams[i].getName().equals("loser")){
				tmp[counter]= new Team(teams[i]);
			counter++;
			}
		}
		this.teams=tmp;
	}
	}
}

