public class IncrementDecrementDemo {
    public void demoIncrementDecrement() {
        int value = 1;
        value = value + 1;
        System.out.println("First Increment: " + value);
        value += 1;
        System.out.println("Second Increment: " + value);
        value++;
        System.out.println("Third Increment: " + value);
        value = value - 1;
        System.out.println("First Decrement: " + value);
        value -= 1;
        System.out.println("Second Decrement: " + value);
        value--;
        System.out.println("Third Decrement: " + value);
    }
}

