// public class deckofCards {
//     public static void main(String[] args) {
//         int[] deck = new int[52];
//         String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
//         String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

//         for (int i = 0; i < deck.length; i++) {
//             deck[i] = i;
//         }
//         // Shuffle the cards
//         for (int i = 0; i < deck.length; i++) {
//             int index = (int) (Math.random() * deck.length);
//             int temp = deck[i];
//             deck[i] = deck[index];
//             deck[index] = temp;
//         }
//         // Display the first four cards
//         for (int i = 0; i < 4; i++) {
//             String suit = suits[deck[i] / 13];
//             String rank = ranks[deck[i] % 13];
//             System.out.println("Card Number " + deck[i] + ":" + rank + " of " + suit);
//         }
//     }
// }

public class deckofCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
        String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        for (int person = 1; person <= 4; person++) {
            System.out.println("Person " + person + " :");
            for (int i = 0; i < 4; i++) {
                String suit = suits[deck[i] / 13];
                String rank = ranks[deck[i] % 13];
                System.out.println("Card number " + deck[i] + " : " + rank + " of " + suit);
            }
        }
    }
}