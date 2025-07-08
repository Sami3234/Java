public class Dicegame {
    public static void main(String[] args) {
        int[] dice = new int[6]; // Array representing the faces of the dice
        for (int i = 0; i < dice.length; i++) {
            dice[i] = i + 1; // Assign values 1 to 6
        }
        for (int i = 0; i < dice.length; i++) {
            int prob = (int) (Math.random() * dice.length);
            int temp = dice[i];
            dice[i] = dice[prob];
            dice[prob] = temp;
        }
        for (int i = 0; i < dice.length; i++) {
            System.out.println("You rolled the dice and got: " + dice[i]);
        }
    }

}