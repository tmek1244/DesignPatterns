package patterns.ObserverPattern;

public class PhoneDisplay implements IDisplay, IObserver{
    private int temperature = 0;
    private WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation)
    {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        this.temperature = this.weatherStation.getTemperature();
    }

    @Override
    public void display() {
        System.out.println(this.temperature);
    }
}
