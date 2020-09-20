package patterns.SingletonPattern;

public class Earth {
    private static Earth instance;
    private double temperature;

    private Earth()
    {
        this.temperature = 20.0;
    }

    public static Earth getInstance()
    {
        if(instance == null)
        {
            instance = new Earth();
        }
        return instance;
    }

    public double getTemperature()
    {
        return this.temperature;
    }

    public void increaseTemperature(double value)
    {
        this.temperature += value;
    }
}
