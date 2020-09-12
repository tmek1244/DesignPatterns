package patterns.ObserverPattern;

public class WatchDisplay implements IObserver, IDisplay{
    private int temperature = 0;
    private WeatherStation weatherStation;

    public WatchDisplay(WeatherStation weatherStation)
    {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        this.temperature = this.weatherStation.getTemperature();
    }

    @Override
    public void display() {
        System.out.println("Watch display: " + this.temperature);
    }
}
