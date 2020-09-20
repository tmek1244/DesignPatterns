package patterns.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Earth earth = Earth.getInstance();

        System.out.println(earth.getTemperature());
        earth.increaseTemperature(0.3);

        function();
    }

    public static void function()
    {
        Earth earth = Earth.getInstance();
        System.out.println(earth.getTemperature());
    }
}
