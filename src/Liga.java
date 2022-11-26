import java.util.ArrayList;

public class Liga {
    private Team[] teams;

    public Liga() {
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public Team[] createTeams(String... name) {
        Team tempTeam;
        ArrayList<Team> teams = new ArrayList<Team>();
        for (String arg : name) {
            tempTeam = new Team(arg);
            teams.add(tempTeam);
        }
        this.teams = new Team[ teams.size() ];
        teams.toArray( this.teams );

        return this.teams;
    }

    public Team getTeam(String name) {
        for (Team team: this.teams) {
            System.out.println(team);
            if (team.getName() == name) return team;
        }
        System.out.println("No team is matching the name: " + name);
        return null;
    }

    public void match(Team heim, Team gast, int toreheim, int toregast) {
        if (toreheim>toregast) {
            heim.addPoints(3);
        } else if (toreheim == toregast) {
            heim.addPoints(1);
            gast.addPoints(1);
        } else {
            gast.addPoints(3);
        }

        heim.addGamesPlayed();
        heim.addGoals(toreheim);
        heim.addConcededGoals(toregast);

        gast.addGamesPlayed();
        gast.addGoals(toregast);
        gast.addConcededGoals(toreheim);
    }

    public int getGoalDiff(Team t) {
        return t.getGoals() - t.getConcededGoals();
    }

    int getMatches(Team t) {
        return t.getGamesPlayed();
    }

    int getPoints(Team t) {
        return t.getPoints();
    }
}
