import java.util.Scanner;
class CricketPlayer {
    String playerCode;
    String name;
    int runs;
    int inningsPlayed;
    int notOut;
    static int playerCount = 0;
    static CricketPlayer[] players;
    CricketPlayer(String playerCode, String name, int runs, int inningsPlayed, int notOut) {
        this.playerCode = playerCode;
        this.name = name;
        this.runs = runs;
        this.inningsPlayed = inningsPlayed;
        this.notOut = notOut;
    }
    static void calculateAverageRuns(CricketPlayer player) {
        double averageRuns = (double) player.runs / (player.inningsPlayed - player.notOut);
        System.out.println("Average runs of player " + player.name + " (" + player.playerCode + ") is: " +
                averageRuns);
    }
    static void calculateAverageRuns() {
        double totalRuns = 0;
        double totalInnings = 0;
        for (int i = 0; i < playerCount; i++) {
            totalRuns += players[i].runs;
            totalInnings += (players[i].inningsPlayed - players[i].notOut);
        }
        double averageRuns = totalRuns / totalInnings;
        System.out.println("Average runs of all players is: " + averageRuns);
    }
    static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("a. Display average runs of a single player.");
            System.out.println("b. Display average runs of all players.");
            System.out.println("c. Exit.");
            System.out.print("Enter your choice: ");
            char choice = scanner.next().charAt(0);
            switch (choice) {
                case 'a':
                    System.out.print("Enter player code: ");
                    String code = scanner.next();
                    boolean found = false;
                    for (int i = 0; i < playerCount; i++) {
                        if (players[i].playerCode.equals(code)) {
                            calculateAverageRuns(players[i]);
                            found = true;

                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Player not found.");
                    }
                    break;
                case 'b':
                    calculateAverageRuns();
                    break;
                case 'c':
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        playerCount = scanner.nextInt();
        players = new CricketPlayer[playerCount];
        for (int i = 0; i < playerCount; i++) {
            System.out.println("Enter details for player " + (i + 1) + ":");
            System.out.print("Player code: ");
            String playerCode = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Runs: ");
            int runs = scanner.nextInt();
            System.out.print("Innings played: ");
            int inningsPlayed = scanner.nextInt();
            System.out.print("Number of times not out: ");
            int notOut = scanner.nextInt();
            players[i] = new CricketPlayer(playerCode, name, runs, inningsPlayed, notOut);
        }
        displayMenu();
    }
}