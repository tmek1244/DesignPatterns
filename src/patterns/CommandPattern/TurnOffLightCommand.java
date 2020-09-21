package patterns.CommandPattern;

public class TurnOffLightCommand implements Command{
    private final Light light;

    public TurnOffLightCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOffLight();
    }

    @Override
    public void unExecute() {
        light.turnOnLight();
    }
}
