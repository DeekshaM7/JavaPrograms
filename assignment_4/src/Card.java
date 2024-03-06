class Card {
    public static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    public static final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "King", "Queen", "Jack"};

    private static int rank;
    private String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public static int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return ranks[rank - 1] + " of " + suit;
    }
}