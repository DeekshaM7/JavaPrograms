import java.util.*;

class Deck {
    private static Vector<Card> deck;

    public Deck() {
        deck = new Vector<>(52);
    }

    public void createDeck() {
        Scanner input = new Scanner(System.in);

        // populate the deck with cards
        for (int rank = 1; rank <= 13; rank++) {
            for (String suit : Card.suits) {
                Card card = new Card(rank, suit);
                deck.add(card);
            }
        }

        // display the menu
        while (true) {
            System.out.println("***************************\n");
            System.out.println("1. Display the deck of cards");
            System.out.println("2. Shuffle the deck of cards");
            System.out.println("3. Draw a card from the deck");
            System.out.println("4. Empty the deck");
            System.out.println("5. Print a card from the deck");
            System.out.println("6. Compare two cards");
            System.out.println("7. Check if two cards are same");
            System.out.println("8. Find card by rank and suit");
            System.out.println("9. Deal a hand of cards");
            System.out.println("10. Quit");
            // get user choice
            System.out.print("Enter your choice (1-10): ");
            int choice = input.nextInt();

            System.out.println("***************************\n");

            // handle user choice
            switch (choice) {
                case 1:
                    // displayDeck(deck);
                    break;
                case 2:
                    //  shuffleDeck(deck);
                    break;
                case 3:
                    // drawCard(deck);
                    break;
                case 4:
                    //  emptyDeck(deck);
                    break;
                case 5:
                    // printCard(deck);
                    break;
                case 6:
                    // compareCard(deck);
                    break;
                case 7:
                    //  sameCard(deck);
                    break;
                case 8:
                    // findCard(deck);
                    break;
                case 9:
                    // dealCard(deck);
                    break;
                case 10:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    // display the current state of the deck
    public static void displayDeck(Vector<Card> deck) {
        System.out.println("Deck of Cards:");
        for (Card card : deck) {
            System.out.println(card);
        }
        System.out.println();
    }

    // shuffle the deck
    public static void shuffleDeck(Vector<Card> deck) {
        Collections.shuffle(deck);
        System.out.println("Deck Shuffled.");
    }

    // draw a card from the deck
    public void drawCard() {
        if (deck.isEmpty()) {
            System.out.println("Deck is empty");
        } else {
            Card card = deck.remove(0);
            System.out.println("You drew: " + card);
        }
    }

    // empty the deck
    public void emptyDeck() {
        deck.clear();
        System.out.println("Deck is emptied.");
    }

    // printCard() function take the input position in the deck and print
    public static void drawCard(Vector<Card> deck) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the position of the card you want to draw: ");
        int position = input.nextInt();

        if (deck.isEmpty()) {
            System.out.println("Deck is empty.");
        } else {
            Card card = deck.get(position);
            System.out.print("You drew:" +card);
        }
    }

    // sameCard() draws 2 random cards and compare their ranks to check if they are same or not
    public void sameCard() {
        Random rand = new Random();
        int firstCard = rand.nextInt(52);
        int secondCard = rand.nextInt(52);

        if (deck.isEmpty()) {
            System.out.println("Deck is empty.");
        } else {
            Card card1 = deck.get(firstCard);
            Card card2 = deck.get(secondCard);
            if (card1.getRank() == card2.getRank()) {
                System.out.println("You drew: "+ card1 + "and" + card2 + "is same.");
            } else {
                System.out.println("You drew: "+ card1 + "and" + card2 + "is not same.");
            }
        }
    }

    //compareCard() draws 2 random cards and compare them to get the card rand and if ranks are same then compare their suits
    public static void compareCard() {
        Random rand = new Random();
        int firstCard = rand.nextInt(52);
        int secondCard = rand.nextInt(52);

        if (deck.isEmpty()) {
            System.out.println("Deck is empty.");
        } else {
            Card card1 = deck.get(firstCard);
            Card card2 = deck.get(secondCard);
            if (card1.getRank() > Card.getRank()) {
                System.out.println("You drew " + card1 + " and" + card2 + "and" + card1 + "is of higher rank.");
            } else if (card1.getRank() < Card.getRank()) {
                System.out.println("You drew " + card1 + " and" + card2 + "and" + card2 + "is of higher rank.");
            } else {
                if (card1.getSuit().equals("Hearts")) {
                    System.out
                            .println("You drew " + card1 + " and" + card2 + "and" + card1 + "is of higher rank.");
                } else if (card2.getSuit().equals("Hearts")) {
                    System.out
                            .println("You drew " + card1 + " and" + card2 + "and" + card2 + "is of higher rank.");
                } else if (card1.getSuit().equals("Diamonds")) {
                    System.out
                            .println("You drew " + card1 + " and" + card2 + "and" + card1 + "is of higher rank.");
                } else if (card2.getSuit().equals("Diamonds")) {
                    System.out
                            .println("You drew " + card1 + " and" + card2 + "and" + card2 + "is of higher rank.");
                } else if (card2.getSuit().equals("Clubs")) {
                    System.out
                            .println("You drew " + card1 + " and" + card2 + "and" + card1 + "is of higher rank.");
                } else if (card2.getSuit().equals("Clubs")) {
                    System.out
                            .println("You drew " + card1 + " and" + card2 + "and" + card2 + "is of higher rank.");
                }
            }
        }
    }

    // sortCard() sorts the deck of cards in ascending order of ranks are same then sort them in ascending order of suits.
    public void sortCard() {
        deck.sort(new Comparator<Card>() {
            @Override
            public int compare(Card card1, Card card2) {
                if (card1.getRank() == card2.getRank()) {
                    return card1.getSuit().compareTo(card2.getSuit());
                } else {
                    return card1.getRank() - card2.getRank();
                }
            }
        });
        System.out.println("Deck of cards:");
        for (Card card : deck) {
            System.out.print(card);
        }
        System.out.println();
    }

    // findCard() takes the input rank and suit and search the deck.
    public void findCard() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rank of the card you want to find: ");
        int rank = input.nextInt();
        System.out.print("Enter the suit (\"Hearts\", \"Diamonds\", \"Clubs\", \"Spades\": ");
        String suit = input.next();

        if (deck.isEmpty()) {
            System.out.println("Deck is empty.");
        } else {
            for (int i = 0; i < deck.size(); i++) {
                Card card = deck.get(i);
                if (card.getRank() == rank && card.getSuit().equals(suit)) {
                    System.out.println("Card found at position " + i);
                    break;
                }
            }
        }
    }

    //dealCard() takes the input number of players and deal the cards to the player.
    public static void findCard(Vector<Card> deck) {
        shuffleDeck(deck);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int players = input.nextInt();

        if(deck.isEmpty()) {
            System.out.println("Deck is empty.");
        } else {
            int cardsPerPlayer = deck.size() / players;
            int remainingCards = deck.size() % players;
            int start = 0;
            int end = cardsPerPlayer;
            for (int i=0; i < players; i++) {
                System.out.println("\nPlayer" + (i+1) + "cards:");
                for (int j=start; j < end; j++) {
                    System.out.println(deck.get(j));
                }
                start = end;
                end += cardsPerPlayer;
            }
            if (remainingCards > 0) {
                System.out.println("Remaining cards:");
                for (int i = end; i < deck.size(); i++) {
                    System.out.println(deck.get(i));
                }
            }
        }
    }
}