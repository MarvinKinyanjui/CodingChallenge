public class IncrementDecrementOrderDemo {
    public void demoIncrementDecrementOrder() {
        int value = 1;
        value++;
        System.out.println("First: " + value);
        System.out.println("Second: " + value++);
        System.out.println("Third: " + value);
        System.out.println("First: " + (++value));

        value = 1;
        ++value;
        value++;
        System.out.println("First: " + value);
    }
}
