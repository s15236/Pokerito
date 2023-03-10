import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
         * Explanation of rules
         */
        System.out.println("\nLet's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println("Kinda poker, but plenty simpler");
        System.out.println(" - There are two players, you and the computer.");
        System.out.println(" - The dealer will give each player one card.");
        System.out.println(" - Then, the dealer will draw five cards (the river)");
        System.out.println(" - The player with the most river matches wins!");
        System.out.println(" - If the matches are equal, everyone's a winner!\n");
        System.out.println("Ready? Type anything if you are.");
        scan.nextLine();

        /*
         * Presenting cards to the player
         */
        String yourCard = randomCard();
        String computersCard = randomCard();

        System.out.println("Here's your card:\n");
        System.out.println(yourCard + "\n");

        System.out.println("Here's the computer's card:\n");
        System.out.println(computersCard);

        int yourMatches = 0;
        int computerMatches = 0;

        /*
         * Game logic
         */
        System.out.println("\nNow, the dealer will draw five cards. Press enter to continue.");

        for (int i = 0; i < 5; i++) {
            scan.nextLine();
            String draw = randomCard();
            System.out.println("Card: " + (i + 1));
            System.out.println("\n" + draw);
            if (draw.equals(yourCard)) {
                yourMatches++;
            } else if (draw.equals(computersCard)) {
                computerMatches++;
            }
        }

        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("Computer number of matches: " + computerMatches);

        if (yourMatches > computerMatches){
            System.out.println("You win!");
        } else if (yourMatches < computerMatches){
            System.out.println("The computer wins!");
        } else {
            System.out.println("That's a tie, go again.");
        }

        scan.close();
    }

    /**
     * Function name ??? randomCard
     *
     * @return (String)
     * <p>
     * Inside the function:
     * 1. Gets a random number between 1 and 13.
     * 2. Returns a card that matches the random number (get the String values from cards.text).
     */
    public static String randomCard() {
        double number = (Math.random() * 13) + 1;
        String card = "";
        return switch ((int) number) {
            case 1 -> """
                       _____
                      |A _  |
                      | ( ) |
                      |(_'_)|
                      |  |  |
                      |____V|
                    """;
            case 2 -> """
                       _____
                      |2    |
                      |  o  |
                      |     |
                      |  o  |
                      |____Z|
                    """;
            case 3 -> """
                       _____
                      |3    |
                      | o o |
                      |     |
                      |  o  |
                      |____E|
                    """;
            case 4 -> """
                       _____
                      |4    |
                      | o o |
                      |     |
                      | o o |
                      |____h|
                    """;
            case 5 -> """
                       _____\s
                      |5    |
                      | o o |
                      |  o  |
                      | o o |
                      |____S|
                    """;
            case 6 -> """
                       _____\s
                      |6    |
                      | o o |
                      | o o |
                      | o o |
                      |____6|
                    """;
            case 7 -> """
                       _____\s
                      |7    |
                      | o o |
                      |o o o|
                      | o o |
                      |____7|
                    """;
            case 8 -> """
                       _____\s
                      |8    |
                      |o o o|
                      | o o |
                      |o o o|
                      |____8|
                    """;
            case 9 -> """
                       _____\s
                      |9    |
                      |o o o|
                      |o o o|
                      |o o o|
                      |____9|
                    """;
            case 10 -> """
                       _____\s
                      |10  o|
                      |o o o|
                      |o o o|
                      |o o o|
                      |___10|
                    """;
            case 11 -> """
                       _____
                      |J  ww|
                      | o {)|
                      |o o% |
                      | | % |
                      |__%%[|
                    """;
            case 12 -> """
                       _____
                      |Q  ww|
                      | o {(|
                      |o o%%|
                      | |%%%|
                      |_%%%O|
                    """;
            case 13 -> """
                       _____
                      |K  WW|
                      | o {)|
                      |o o%%|
                      | |%%%|
                      |_%%%>|
                    """;
            default -> "ERROR";
        };
    }

}
