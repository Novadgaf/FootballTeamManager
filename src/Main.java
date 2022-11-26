public class Main {
    public static void main(String[] args) {
        Liga liga = new Liga();

        Team[] teams = liga.createTeams("1", "2", "3");

        Team team1 = liga.getTeam("1");
        Team team2 = liga.getTeam("2");

        liga.match(team1, team2, 5, 4);

        System.out.println("Team 1 stats:");
        System.out.println("Goals: " + team1.getGoals());
        System.out.println("Conceded Goals: " + team1.getConcededGoals());
        System.out.println("Goal Diff: " + liga.getGoalDiff(team1));
        System.out.println("Points: " + liga.getPoints(team1));
        System.out.println("======================================");
        System.out.println("Team 2 stats:");
        System.out.println("Goals: " + team2.getGoals());
        System.out.println("Conceded Goals: " + team2.getConcededGoals());
        System.out.println("Goal Diff: " + liga.getGoalDiff(team2));
        System.out.println("Points: " + liga.getPoints(team2));
    }
}
