import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);


        System.out.print("Enter your lottery pick (2 Digits): ");
        String guess = scanner.nextLine();

        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        System.out.println("The lottery number is " + lottery);

        if(guess.equals(lottery)) {
            System.out.println("Exact match: you win $10,000.00");
        } else if(guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
            System.out.println("Match All Digits: You win $3,000.00");
        } else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one: You win $1,000.00");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}