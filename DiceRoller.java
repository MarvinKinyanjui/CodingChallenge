import java.util.Random;

public class DiceRoller {
public void rollDice() {
        Random dice = new Random();
        int roll1 = dice.nextInt();
        int roll2 = dice.nextInt(101);
        int roll3 = dice.nextInt(50, 101);
        System.out.println("First roll: " + roll1);
        System.out.println("Second roll: " + roll2);
        System.out.println("Third roll: " + roll3);
    }
}
