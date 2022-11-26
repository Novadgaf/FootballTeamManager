public class Team {
    private String name;
    private int goals;
    private int concededGoals;
    private  int gamesPlayed;
    private int points;


    public Team(String name) {
        this.name = name;
        this.goals = 0;
        this.concededGoals = 0;
        this.gamesPlayed = 0;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoals() {
        return goals;
    }

    public void addGoals(int goals) {
        this.goals += goals;
    }

    public int getConcededGoals() {
        return concededGoals;
    }

    public void addConcededGoals(int concededGoals) {
        this.concededGoals += concededGoals;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void addGamesPlayed() {
        this.gamesPlayed += 1;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points += points;
    }
}
