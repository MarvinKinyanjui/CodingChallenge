public class Main {
    public static void main(String[] args) throws Exception {
         // Increment and Decrement
         IncrementDecrementDemo demo1 = new IncrementDecrementDemo();
         demo1.demoIncrementDecrement();
 
         // Increment and Decrement Order
         IncrementDecrementOrderDemo demo2 = new IncrementDecrementOrderDemo();
         demo2.demoIncrementDecrementOrder();
 
         // Temperature Conversion
         TemperatureConverter converter = new TemperatureConverter();
         converter.convertToCelsius(94);
         converter.convertToFahrenheit(34.4);
 
         // Random Dice Rolls
         DiceRoller diceRoller = new DiceRoller();
         diceRoller.rollDice();
 
         // Dice Decision
         DiceDecision diceDecision = new DiceDecision();
         diceDecision.makeDecision();
 
         // Subscription Expiration
         SubscriptionChecker subscriptionChecker = new SubscriptionChecker();
         subscriptionChecker.checkSubscription();
     }
 }
 
    

